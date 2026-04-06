package main.java;

class Board {

    private final String[] board;
    private final int size;
    private int amountMarkedCells = 0;


    Board(int size) {
        this.size = size;
        board = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    }

    void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i * size + j] + " ");
            }
            System.out.println();
        }
    }

    boolean isCellMarkValid(int terminalNumber, MarkerCategory category) {
        if (terminalNumber < 1 || terminalNumber > size * size) {
            System.out.println("Invalid number");
            return true;
        }

        String cell = board[terminalNumber - 1];
        if (cell.equals(MarkerCategory.X.getMarker()) || cell.equals(MarkerCategory.CIRCLE.getMarker())) {
            System.out.println("Cell already marked");
            return true;
        }

        board[terminalNumber - 1] = category.getMarker();
        amountMarkedCells++;
        return false;
    }

    String[] getBoard() {
        return board;
    }

    int getAmountMarkedCells() {
        return amountMarkedCells;
    }

}
