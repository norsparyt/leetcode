// Last updated: 30/05/2026, 00:03:58
class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length-1;
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+mat[i][i]+mat[i][n-i];
        }
        if((n+1)%2==0)
            return sum;
        else 
            return sum-mat[n/2][n/2];
    }
}