// Last updated: 30/05/2026, 00:04:51
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if ((r * c) != (m * n))
            return mat;
        int[][] ans = new int[r][c];

        for (int k = 0; k < m * n; k++) {
            ans[k / c][k % c] = mat[k / n][k % n];
        }
        return ans;
    }
}