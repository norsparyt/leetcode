// Last updated: 31/05/2026, 19:12:04
// GFG Solution: needs to be personalised
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int[][] memo = new int[coins.length][amount + 1];
4        for (int[] row : memo) Arrays.fill(row, -1);
5        int ans = minCoinsRecur(0, amount, coins, memo);
6        return ans != Integer.MAX_VALUE ? ans : -1;
7    }
8
9    int minCoinsRecur(int i, int sum, int[] coins, int[][] memo) {
10
11        // base case
12        if (sum == 0) return 0;
13        if (sum < 0 || i == coins.length) return Integer.MAX_VALUE;
14        
15        if (memo[i][sum] != -1) return memo[i][sum];
16        
17        int take = Integer.MAX_VALUE;
18        
19        // take a coin only if its value
20        // is greater than 0.
21        if (coins[i] > 0) {
22            take = minCoinsRecur(i, sum - coins[i], coins, memo);
23            if (take != Integer.MAX_VALUE) take++;
24        }
25        // not take the coin 
26        int noTake = minCoinsRecur(i + 1, sum, coins, memo);
27        
28        return memo[i][sum] = Math.min(take, noTake);
29    }
30}