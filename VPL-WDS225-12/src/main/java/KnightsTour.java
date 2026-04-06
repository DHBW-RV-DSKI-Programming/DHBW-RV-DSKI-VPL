public class KnightsTour {

    static class Chessboard {
        private final int size;
        private final int[][] board;
        private int moveCount;

        // Possible knight moves: 2 in one direction, 1 in the other
        private final int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
        private final int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

        public Chessboard(int size) {
            this.size = size;
            this.board = new int[size][size];
            this.moveCount = 1;

            // Initialize board with -1 (unvisited)
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    board[i][j] = -1;
                }
            }
        }

        // Check if position is valid and unvisited
        private boolean isValid(int x, int y) {
            return x >= 0 && x < size && y >= 0 && y < size && board[x][y] == -1;
        }

        // Backtracking algorithm to solve the problem
        public boolean solve(int x, int y) {
            board[x][y] = moveCount;

            // Success if all squares have been visited
            if (moveCount == size * size) {
                return true;
            }

            // Try all 8 possible moves
            for (int i = 0; i < 8; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];

                if (isValid(nextX, nextY)) {
                    moveCount++;
                    if (solve(nextX, nextY)) {
                        return true;
                    }
                    // Backtrack
                    moveCount--;
                    board[nextX][nextY] = -1;
                }
            }

            return false;
        }

        // Print the tour as a list
        public void printTour() {
            System.out.println("Found tour:");
            int[][] positions = new int[size * size][2];

            // Find positions in order
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (board[i][j] != -1) {
                        positions[board[i][j] - 1][0] = i;
                        positions[board[i][j] - 1][1] = j;
                    }
                }
            }

            // Output
            for (int i = 0; i < positions.length; i++) {
                System.out.print("(" + positions[i][0] + ", " + positions[i][1] + ")");
                if (i < positions.length - 1) {
                    System.out.print(" -> ");
                }
                if ((i + 1) % 8 == 0 && i < positions.length - 1) {
                    System.out.println();
                }
            }
            System.out.println();
            System.out.println("Total number of moves: " + (size * size));
        }

        // Visualize the chessboard
        public void printBoard() {
            System.out.println("\nChessboard visualization:");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.printf("%3d ", board[i][j]);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int boardSize = 8;
        Chessboard chessboard = new Chessboard(boardSize);

        System.out.println("Searching for a solution to the " + boardSize + "x" + boardSize + " knight's tour problem...");
        System.out.println();

        // Start at position (0, 0)
        if (chessboard.solve(0, 0)) {
            chessboard.printTour();
            chessboard.printBoard();
        } else {
            System.out.println("No solution found!");
        }
    }
}
