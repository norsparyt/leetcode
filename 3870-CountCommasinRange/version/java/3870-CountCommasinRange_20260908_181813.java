// Last updated: 08/09/2026, 18:18:13
1class Solution {
2    public int countCommas(int n) {
3        int count = 0;
4        if(n<1000) 
5            return count;
6        count = n - 999;
7        return count;
8    }
9}