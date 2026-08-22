// Last updated: 22/08/2026, 22:32:54
/*
 * Greedy Classic Activity Selection:
 * Easy
*/

1class Solution {
2    public int eraseOverlapIntervals(int[][] pair) {
3        Arrays.sort(pair,(x,y)->Integer.compare(x[1],y[1]));
4        int prevEnd = pair[0][1];
5        int count = 1;
6        for(int j=1; j<pair.length;j++){
7            if(pair[j][0]>=prevEnd){
8                count++;
9                prevEnd=pair[j][1];
10            }
11        }
12        return pair.length - count;
13    }
14}