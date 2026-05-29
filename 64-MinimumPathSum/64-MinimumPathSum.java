// Last updated: 30/05/2026, 00:06:36
class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int dp[][] = new int[row + 1][col + 1];
        for (int i = 0; i <= row; i++)
            Arrays.fill(dp[i], -1);
        return findPath(0, 0, row, col, grid, dp);
    }

    int findPath(int r, int c, int row, int col, int[][] grid, int[][] dp) {
        if (r == row - 1 && c == col - 1)
            return grid[r][c];
        if (r >= row || c >= col) 
            return Integer.MAX_VALUE;
        if (dp[r][c] != -1)
            return dp[r][c];
        int right =  findPath(r , c+1 , row, col, grid, dp);
        int down = findPath(r+1 , c, row, col, grid, dp);
        return dp[r][c] = grid[r][c]+ Math.min(right, down);
        }   
}