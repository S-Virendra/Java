public class NQueens {

    static int N = 4;

    // Function to print the board
    static void printBoard(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Check if placing queen is safe
    static boolean isSafe(int board[][], int row, int col) {
        // Check this column on upper side
        for (int i = 0; i < row; i++)
            if (board[i][col] == 1)
                return false;

        // Check upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check upper right diagonal
        for (int i = row, j = col; i >= 0 && j < N; i--, j++)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    // Solve N-Queens using backtracking
    static void solveNQueens(int board[][], int row) {
        if (row == N) {
            printBoard(board);
            return;
        }

        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1; // Place queen
                solveNQueens(board, row + 1);
                board[row][col] = 0; // Backtrack
            }
        }
    }

    public static void main(String[] args) {
        int board[][] = new int[N][N];
        solveNQueens(board, 0);
    }
}
