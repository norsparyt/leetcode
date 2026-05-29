// Last updated: 30/05/2026, 00:06:41
class Solution {
    public int[][] generateMatrix(int n) {
        //simple tweak of spiral 1
        int[][] matrix= new int[n][n];
        int count=1;
        int top = 0, right = matrix[0].length - 1, left = 0, bottom = matrix.length - 1;
        while (left <= right && top <= bottom) {
            for (int j = left; (j <= right && top <= bottom); j++) {
                matrix[top][j]=count;
                count++;
            }
            top++;
            for (int i = top; i <= bottom && left <= right; i++) {
                matrix[i][right]=count;
                count++;
            }
            right--;
            for (int j = right; j >= left && top <= bottom; j--) {
                matrix[bottom][j]=count;
                count++;
            }
            bottom--;
            for (int i = bottom; i >= top && left <= right; i--) {
                matrix[i][left]=count;
                count++;
            }
            left++;
        }
        return matrix;
    }
}