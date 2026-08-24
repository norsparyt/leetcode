// Last updated: 25/08/2026, 03:56:47
// Maths puzzle. Know it.
1class Solution {
2    public int bulbSwitch(int n) {
3        int count = 0;
4        for(int i = 1; i <= n; i++){
5            if(i <= n/i)
6                count++;
7        }
8        return count;
9    }
10}