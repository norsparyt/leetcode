// Last updated: 30/05/2026, 00:06:47
class Solution {
    static String[][] ans;

    public List<List<String>> solveNQueens(int n) {
        ans = new String[n][n];
        for (int i = 0; i < n; i++)
            Arrays.fill(ans[i], ".");

        List<List<String>> res = new ArrayList<List<String>>(n);
        nQueens(res, 0);
        return res;
    }

    void nQueens(List<List<String>> res, int row) {
        if (row == ans.length) {
            List<String> board = new ArrayList<>();
            for (int i = 0; i < ans.length; i++) {
                board.add(String.join("", ans[i]));
            }
            res.add(board);
            return;
        }
        for (int col = 0; col < ans.length; col++) {
            if (isSafe(row, col)) {
                ans[row][col] = "Q";
                nQueens(res, row + 1);
                ans[row][col] = ".";
            }
        }
    }

    boolean isSafe(int row, int col) {
        for (int r = row - 1; r >= 0; r--) {
            if (ans[r][col].equals("Q"))
                return false;
        }
        for (int r = row - 1, c = col - 1; r >= 0 && c >= 0; c--, r--) {
            if (ans[r][c].equals("Q"))
                return false;
        }
        for (int r = row - 1, c = col + 1; r >= 0 && c < ans.length; c++, r--) {
            if (ans[r][c].equals("Q"))
                return false;
        }
        return true;
    }
}