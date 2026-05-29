// Last updated: 30/05/2026, 00:06:44
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        // int i = 0, j = 0;
        int top = 0, right = n, left = 0, bottom = m;
        while (left <= right && top <= bottom) {
            for (int j = left; (j <= right && top <= bottom); j++) {
                res.add(matrix[top][j]);
            }
            top++;
            for (int i = top; i <= bottom && left <= right; i++) {
                res.add(matrix[i][right]);
            }
            right--;
            for (int j = right; j >= left && top <= bottom; j--) {
                res.add(matrix[bottom][j]);
            }
            bottom--;
            for (int i = bottom; i >= top && left <= right; i--) {
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }
}