// Last updated: 04/06/2026, 17:44:37
// Hard. No words. Retry.
1class Solution {
2    public int maxCoins(int[] nums) {
3        int n = nums.length;
4        int[] arr = new int[n + 2];
5        arr[0] = 1;
6        arr[n + 1] = 1;
7        for (int i = 0; i < n; i++)
8            arr[i + 1] = nums[i];
9        int[][] dp = new int[n + 2][n + 2];
10        for (int[] row : dp) {
11            Arrays.fill(row, -1);
12        }
13        return solve(1, n, arr, dp);
14    }
15    int solve(int left, int right, int[] arr, int[][] dp){
16        if(right<left) return 0;
17        if (dp[left][right] != -1)
18            return dp[left][right];
19        int maxCoins=0;
20        for(int i=left;i<=right; i++){
21            int coins = arr[left-1] * arr[i] * arr[right+1] 
22                        + solve(left, i-1, arr, dp)
23                        + solve(i+1, right, arr, dp);
24            maxCoins= Math.max(maxCoins, coins);
25        }
26        return dp[left][right] = maxCoins;
27    }
28}