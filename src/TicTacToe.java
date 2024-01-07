import java.util.Scanner;


public class TicTacToe {
    private char[][] board;
    private char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';

        // Initialize the board with empty spaces
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public boolean makeMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ') {
            return false; // Invalid move
        }

        board[row][col] = currentPlayer;
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        return true;
    }

    public boolean checkWin() {
        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return true; // Row win
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
                return true; // Column win
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            return true; // Diagonal win
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
            return true; // Diagonal win
        }

        return false; // No win
    }

    public boolean isBoardFull() {
        // Check if the board is full
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; // Board is not full
                }
            }
        }
        return true; // Board is full
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();

        while (!game.checkWin() && !game.isBoardFull()) {
            game.printBoard();
            System.out.println("Player " + game.currentPlayer + "'s turn.");
            System.out.print("Enter row (0, 1, or 2): ");
            int row = scanner.nextInt();
            System.out.print("Enter column (0, 1, or 2): ");
            int col = scanner.nextInt();

            if (game.makeMove(row, col)) {
                System.out.println("Move accepted!");
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        game.printBoard();

        if (game.checkWin()) {
            System.out.println("Player " + game.currentPlayer + " wins!");
        } else {
            System.out.println("It's a draw!");
        }

        scanner.close();
    }
}
