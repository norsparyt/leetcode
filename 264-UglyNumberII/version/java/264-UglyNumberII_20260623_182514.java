// Last updated: 23/06/2026, 18:25:14
/*
 * DP soln (gfg )
 * 3 caveats:
 * 1. start loop from i =1 since dp[0] gets set to 2 
 * 2. using if blocks only (no else) since duplicate handling - increment all pointers that reach the multiple so that they are not added (and move i forward uselessly)
 * 3. keep increment pointer first and assign later inside condition
*/

1class Solution {
2    public int nthUglyNumber(int n) {
3        int p1 = 0, p2 = 0, p3 = 0;
4        int f1 = 2, f2 = 3, f3 = 5;
5        int[] dp = new int[n];
6        int ugly = 1;
7        dp[0] = ugly;
8        for (int i = 1; i <n; i++) {
9            ugly = Math.min(f1, Math.min(f2, f3));
10            dp[i] = ugly;
11            System.out.println(f1+ ","+f2+ ","+f3);
12            if (ugly == f1) {
13                p1++;
14                f1 = dp[p1]*2;
15            } if (ugly == f2) {
16                p2++;
17                f2 = dp[p2]*3;
18            } if (ugly == f3) {
19                p3++;
20                f3 = dp[p3]*5;
21            }
22        }
23        return ugly;
24    }
25}