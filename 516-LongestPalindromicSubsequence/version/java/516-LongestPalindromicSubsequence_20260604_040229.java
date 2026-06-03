// Last updated: 04/06/2026, 04:02:29
/*
 * DP: yet another variation of Longest common subsequence ques( between 2 strings)
 * caveats:
 * - don't multiple final func result *2 : instead add 2 to ans if matching character, if i==j add only 1( for odd length integers)
 * - 2d dp is still needed since 2 states are present for the same string(n*n)
*/

1class Solution {
2    public int longestPalindromeSubseq(String text) {
3        int n = text.length();
4        int[][] dp = new int[n][n];
5        for (int[] row : dp)
6            Arrays.fill(row, -1);
7        return solve(0, n - 1, text, dp);
8    }
9
10    int solve(int i, int j, String text, int[][] dp) {
11        if (i > j || i >= text.length() || j < 0)
12            return 0;
13        if (dp[i][j] != -1)
14            return dp[i][j];
15        if (text.charAt(i) == text.charAt(j)){
16            int add = (i==j)? 1:2;
17            return dp[i][j] = add + solve(i + 1, j - 1, text, dp);
18        }
19
20        return dp[i][j] = Math.max(solve(i + 1, j, text, dp), solve(i, j - 1, text, dp));
21    }
22}