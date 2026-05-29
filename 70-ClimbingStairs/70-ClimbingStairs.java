// Last updated: 30/05/2026, 00:06:30
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return fib(n, dp);
    }
    int fib(int n, int[] dp){
        if(n<=1) return 1;
        if(dp[n] != -1) return dp[n];
        dp[n] = fib(n-1, dp) + fib(n-2, dp);
        return dp[n];
    }
}