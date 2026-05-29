// Last updated: 30/05/2026, 00:06:28
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            int row = middle / n;
            int column = middle % n;
            if (matrix[row][column] == target)
                return true;
            else if (matrix[row][column] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return false;
    }
}