package main.java;

import java.util.Scanner;

class TicTacToeGame {

    private boolean isGameOver = false;
    private boolean isPlayer1Turn = true;
    private static final Scanner sc = new Scanner(System.in);

    void start() {
        Board board = new Board(3);
        board.printBoard();

        Player player1 = new Player("Player 1", MarkerCategory.X);
        Player player2 = new Player("Player 2", MarkerCategory.CIRCLE);

        System.out.println(player1.name() + " has marker " + player1.marker());
        System.out.println(player2.name() + " has marker " + player2.marker());

        while (!isGameOver) {
            makeTurn(board, player1, player2);
        }

        sc.close();
    }

    private void makeTurn(Board board, Player player1, Player player2) {
        Player currentPlayer = isPlayer1Turn ? player1 : player2;
        System.out.println("Turn of Player " + currentPlayer.name() + " with marker " + currentPlayer.marker());

        checkInput(board, currentPlayer);

        board.printBoard();
        isPlayer1Turn = !isPlayer1Turn;
        System.out.println("-------------------------------------------------");
        System.out.println();

        if (board.getAmountMarkedCells() < 5) {
            return;
        }

        isGameOver = isGameOver(board.getBoard(), currentPlayer.marker().getMarker());

        if (isGameOver) {
            System.out.println("Player " + currentPlayer.name() + " wins");
        }

        if (!isGameOver && board.getAmountMarkedCells() == 9) {
            System.out.println("Game is a draw");
            isGameOver = true;
        }
    }

    private void checkInput(Board board, Player currentPlayer) {
        boolean isInvalidInput;
        do {
            System.out.print("Enter number: ");
            int num1 = sc.nextInt();
            sc.nextLine();

            isInvalidInput = board.isCellMarkValid(num1, currentPlayer.marker());
        } while (isInvalidInput);
    }


    private boolean isGameOver(String[] cells, String marker) {
        if (cells[0].equals(marker) && cells[1].equals(marker) && cells[2].equals(marker)) {
            return true;
        } else if (cells[3].equals(marker) && cells[4].equals(marker) && cells[5].equals(marker)) {
            return true;
        } else if (cells[6].equals(marker) && cells[7].equals(marker) && cells[8].equals(marker)) {
            return true;
        } else if (cells[0].equals(marker) && cells[3].equals(marker) && cells[6].equals(marker)) {
            return true;
        } else if (cells[1].equals(marker) && cells[4].equals(marker) && cells[7].equals(marker)) {
            return true;
        } else if (cells[2].equals(marker) && cells[5].equals(marker) && cells[8].equals(marker)) {
            return true;
        } else if (cells[0].equals(marker) && cells[4].equals(marker) && cells[8].equals(marker)) {
            return true;
        } else if (cells[2].equals(marker) && cells[4].equals(marker) && cells[6].equals(marker)) {
            return true;
        } else return false;
    }

}
