// Last updated: 30/05/2026, 00:04:20
class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return fib_dp(n, dp);
    }
    int fib_dp(int n, int[] dp) {
        if(n<=1) return n;
        if(dp[n] != -1) return dp[n];
        dp[n] = fib_dp(n-1, dp) + fib_dp(n-2, dp);
        return dp[n];
    }
}