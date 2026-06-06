// Last updated: 06/06/2026, 20:09:41
// easy bit manipulation
1class Solution {
2    public boolean consecutiveSetBits(int n) {
3        int count = 0;
4        while(n!=0){
5            int curr = n&1;
6            int prev = (n>>1)&1;
7            if(curr == 1 && prev ==1)
8                count++;
9            n = n>>1;
10        }
11        if(count == 1) return true;
12        return false;
13    }
14}