// Last updated: 03/06/2026, 01:02:32
// Intuition didnt come up by myself. Regular dp question with 2 states.
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int n = word1.length()-1;
4        int m = word2.length()-1;
5        int[][] dp = new int[n+1][m+1];
6        for (int[] row : dp) 
7            Arrays.fill(row, -1);
8        return count(n, m, word1, word2, dp);
9    }
10
11    int count(int i, int j, String word1, String word2, int[][] dp) {
12        if (i < 0)
13            return j+1;
14        if (j < 0)
15            return i+1;
16        if(dp[i][j]!=-1)
17            return dp[i][j];
18        if (word1.charAt(i) == word2.charAt(j)) {
19            return dp[i][j] = 0 + count(i - 1, j - 1, word1, word2, dp);
20        } else {
21            int insert = count(i, j - 1, word1, word2, dp);
22            int delete = count(i-1, j, word1, word2, dp);
23            int replace = count(i - 1, j - 1, word1, word2, dp);
24            return dp[i][j] = 1 + Math.min(insert, Math.min(delete, replace));
25        }
26    }
27}