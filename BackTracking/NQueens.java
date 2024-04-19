package BackTracking;





public class NQueens {
    public static void printBoard(char board[][]) {
       
        System.out.println("---------Chess Board -------------");
        
        for (int i = 0; i < board.length; i++) {
           
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " "); // Use print instead of println to keep the board in the same line
            }
            System.out.println(); // Print a new line after each row
        }
    }

    public static void nqueens(char[][] board, int row) {
        // base case: all queens are placed
        if (row == board.length) {
           // printBoard(board);
           cnt++;
            return;
        }
        // column loop 
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nqueens(board, row + 1);
                board[row][j] = 'X'; // backtrack
            }
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // Check if there is a queen in the same column above
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static int cnt=0; 
    public static boolean nqueens1(char[][] board, int row) {
        // base case: all queens are placed
        if (row == board.length) {
           // printBoard(board);
           cnt++;
            return true;
        }
        // column loop 
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
               if(nqueens1(board, row + 1)){
                   return true;
               }
                board[row][j] = 'X'; // backtrack
            }
        }
        return false;
    }

    public static void main(String args[]) {
       int n=5;

        char board[][] = new char[n][n];
        // initialization 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        // nqueens(board, 0);
        // System.out.println("solutions:"+cnt);
        if(nqueens1(board, n)){
            System.out.println("Solution is possible ");
            printBoard(board);
        }
        else{
            System.out.println("Solution is not possible ");
        }
    }
}
