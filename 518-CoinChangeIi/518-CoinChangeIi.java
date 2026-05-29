// Last updated: 30/05/2026, 00:04:59
class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for (int i = 0; i < n; i++)
            Arrays.fill(dp[i], -1);
        return count(n - 1, amount, coins, dp);
    }

    int count(int n, int amount, int[] coins, int[][] dp) {
        if (amount < 0 || n < 0)
            return 0;
        if (amount == 0)
            return 1;
        if (dp[n][amount] != -1)
            return dp[n][amount];
        //2 cases: 
        // include curr idx and stay at curr idx or 
        // dont include curr and go to prev idx
        return dp[n][amount] = count(n, amount - coins[n], coins, dp) + count(n - 1, amount, coins, dp);
    }
}