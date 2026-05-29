// Last updated: 30/05/2026, 00:06:39
class Solution {
    public int uniquePaths(int m, int n) {
        int row = m, col = n;
        int dp[][] = new int[row][col];
        for (int i = 0; i < row; i++)
            Arrays.fill(dp[i], -1);
        if (row == 1 && col == 1)
            return 1;
        return findPaths(0, 0, row, col, dp);
    }

    int findPaths(int r, int c, int row, int col, int[][] dp) {
        if (r == row - 1 && c == col - 1)
            return 1;
        if (r < row && c < col) {
            if (dp[r][c] != -1)
                return dp[r][c];
            return dp[r][c] = findPaths(r + 1, c, row, col, dp) + findPaths(r, c + 1, row, col, dp);
        }
        return 0;
    }
}