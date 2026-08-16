// Last updated: 17/08/2026, 02:53:46
/*
 * DP: Memoization
 * Caveats:
 * 1. the whole - breaking the array at every pos in a for loop
 * 2. calling with start and end indexes
 * 3. converting to 2d dp
 * PLEASE RETRY.
*/

1class Solution {
2    public int mctFromLeafValues(int[] arr) {
3        int n = arr.length;
4        int[][] rangeMax = new int[n][n];
5        int[][] dp = new int[n+1][n+1];
6
7        for(int[] row: dp){
8            Arrays.fill(row, -1);
9        }
10        for(int i = 0; i< arr.length; i++){
11            int max = Integer.MIN_VALUE;
12            for(int j = i; j< arr.length; j++){
13                max = Math.max(max, arr[j]);
14                rangeMax[i][j] = max;
15            }
16        }
17        return getMinCost(0,n-1, rangeMax, dp);
18    }
19    int getMinCost(int start, int end, int[][] rangeMax, int[][] dp){
20        if(start == end) 
21            return 0;
22        if(dp[start][end]!=-1) 
23            return dp[start][end];
24        int minSum = Integer.MAX_VALUE;
25        for(int i = start; i < end; i++){
26            int left = getMinCost(start, i, rangeMax, dp);
27            int right = getMinCost(i+1, end, rangeMax, dp);
28            int curr = rangeMax[start][i] * rangeMax[i+1][end];
29            int sum = left + right + curr;
30            minSum = Math.min(sum, minSum);        
31            }
32        dp[start][end] = minSum;
33        return minSum;
34    }
35}