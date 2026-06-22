// Last updated: 23/06/2026, 02:18:11
// dp soln
1class Solution {
2    public int nthUglyNumber(int n) {
3        if (n <= 0) return 0;
4        
5        int[] dp = new int[n];
6        dp[0] = 1; 
7        
8        int p2 = 0, p3 = 0, p5 = 0;
9        
10        for (int i = 1; i < n; i++) {
11            int next2 = dp[p2] * 2;
12            int next3 = dp[p3] * 3;
13            int next5 = dp[p5] * 5;
14            
15            int nextUgly = Math.min(next2, Math.min(next3, next5));
16            dp[i] = nextUgly;
17            
18            
19            if (nextUgly == next2) p2++;
20            if (nextUgly == next3) p3++;
21            if (nextUgly == next5) p5++;
22        }
23        
24        return dp[n - 1];
25    }
26}