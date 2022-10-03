

public class EightQueens {

    final int boardSize = 8;
    int[][] board = new int[boardSize][boardSize];

    // Constructor
    private EightQueens() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                this.board[i][j] = 0;
            }
        }
    }

    private boolean isRowValid(int row) {
        int sum = 0;
        for (int column = 0; column < boardSize; column++) {
            sum += this.board[row][column];
        }
        return sum == 1;
    }

    private boolean isColumnValid(int column) {
        int sum = 0;
        for (int row = 0; row < boardSize; row++) {
            sum += this.board[row][column];
        }
        return sum == 1;
    }


    private boolean isValid() {
        // Check SW-NE diagonals
        // Check NW-SE diagonals
        return true;
    }

    private void printBoard() {
        System.out.println("   1  2  3  4  5  6  7  8");
        for (int i = 0; i < boardSize; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < boardSize; j++) {
                System.out.print("  " + this.board[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {

        EightQueens q8 = new EightQueens();
        q8.printBoard();

    }
}
