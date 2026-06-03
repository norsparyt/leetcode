// Last updated: 04/06/2026, 03:32:33
/*
 * DP needed: 
 * Recursion take O(2ˆ(n+m)) time and O(m+n) stack space. 
 * An easier variation of Edit distance between 2 strings.
*/

1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int m = text1.length(), n = text2.length();
4        int[][] dp = new int[m][n];
5        for (int[] row : dp)
6            Arrays.fill(row, -1);
7        return solve(m - 1, n - 1, text1, text2, dp);
8    }
9
10    int solve(int i, int j, String text1, String text2, int[][] dp) {
11        if (i < 0 || j < 0)
12            return 0;
13        if (dp[i][j] != -1)
14            return dp[i][j];
15        if (text1.charAt(i) == text2.charAt(j))
16            return dp[i][j] = 1 + solve(i - 1, j - 1, text1, text2, dp);
17
18        return dp[i][j] = Math.max(solve(i - 1, j, text1, text2, dp), solve(i, j - 1, text1, text2, dp));
19    }
20}