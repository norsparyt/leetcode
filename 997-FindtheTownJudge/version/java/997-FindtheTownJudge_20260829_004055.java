// Last updated: 29/08/2026, 00:40:55
/*
 * Arrays Soln: track count only 
 * Caveats:
 * - reducing the in degree's count to mismatch the n-1 equality
*/

1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        int [] count = new int[n+1];
4        for(int i = 0; i< trust.length; i++){
5            count[trust[i][0]]--;
6            count[trust[i][1]]++;
7        }
8        for(int i=1; i<= n; i++){
9            if(count[i] == n-1)
10                return i;
11        }
12        return -1;
13    }
14} 