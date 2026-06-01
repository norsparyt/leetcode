// Last updated: 02/06/2026, 00:47:00
// Tough one to think of, try to find conditions where it it fails and avoid them else return 1. Dp needed to optimised recursive approach.
1class Solution {
2    public int numDecodings(String s) {
3        int[] dp = new int[s.length()];
4        Arrays.fill(dp, -1);
5        return combinations(0, s, dp);
6    }
7    //recursive solution - note that the way to find valid double digit was not
8    // through charAt or Integer.parseInt
9    int combinations(int i, String s, int[] dp){
10        if(i >= s.length())
11            return 1;
12        if(dp[i] != -1)
13            return dp[i];
14        int ways=0;
15        if(s.charAt(i) != '0')
16            ways = combinations(i+1, s, dp);
17        if ((i+1 < s.length()) && 
18                ((s.charAt(i) == '1' && (s.charAt(i+1) >= '0' && s.charAt(i+1) <= '9' )) ||
19                (s.charAt(i) == '2' && (s.charAt(i+1) >= '0' && s.charAt(i+1) <= '6' )))
20            )
21            ways += combinations(i+2, s, dp);
22        return dp[i] = ways;
23    }
24
25}