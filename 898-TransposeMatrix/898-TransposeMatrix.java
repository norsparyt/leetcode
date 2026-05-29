// Last updated: 30/05/2026, 00:04:29
class Solution {
    public int[][] transpose(int[][] mat) {
        int[][] tp= new int[mat[0].length][mat.length];
        for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<mat.length;j++){
                tp[i][j]=mat[j][i];
            }
        }
        return tp;
    }
}