// Last updated: 30/05/2026, 00:06:53
class Solution {
    public void solveSudoku(char[][] board) {
        explore(0, 0, board);
    }

    boolean explore(int row, int col, char[][] board) {
        if (col == 9) {
            row++;
            col = 0;
        }
        //this comes later to prevent 9,0 from happening
        if (row == 9)
            return true;

        if (board[row][col] == '.') {
            for (char ch = '1'; ch <= '9'; ch++) {
                if (isValid(ch, row, col, board)) {
                    board[row][col] = ch;
                    if (explore(row, col + 1, board))
                        return true;
                    board[row][col] = '.';
                }
            }
            return false;
        } else
            return explore(row, col + 1, board);
    }

    boolean isValid(char ch, int i, int j, char[][] board) {

        //check if not same vertically
        for (int row = 0; row < 9; row++) {
            if (board[row][j] == ch) {
                return false;
            }
        }
        //check if not same horizontally
        for (int col = 0; col < 9; col++) {
            if (board[i][col] == ch) {
                return false;
            }
        }
        //check if this grid does not contain character
        int block_row = i / 3;
        int block_col = j / 3;
        for (int row = block_row * 3; row < (block_row * 3) + 3; row++) {
            for (int col = block_col * 3; col < (block_col * 3) + 3; col++) {
                if (board[row][col] == ch) {
                    return false;
                }
            }
        }
        return true;
    }

}