public class Nquens_Backtracking_que {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println("Total solutions: " + queens(board, 0));
    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        // Placing the queen and checking for each column in the current row
        for (int col = 0; col < board.length; col++) {
            // Place the queen if it is safe
            if (isSafe(board, row, col)) {
                board[row][col] = true; // Place the queen
                count += queens(board, row + 1); // Recursively place the rest
                board[row][col] = false; // Backtrack
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // Check for vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // Diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // Diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }


}


//  space complexity-->n*n
  