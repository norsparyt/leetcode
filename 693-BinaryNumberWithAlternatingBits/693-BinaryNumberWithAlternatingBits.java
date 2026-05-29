// Last updated: 30/05/2026, 00:04:47
class Solution {
    public boolean hasAlternatingBits(int n) {
        int res=(n>>1)^n;
        // return(~res)==0;
        //wrong since not all 32 bits are 1's(-1) only 3 bits are
        return (res&(res+1))==0;
    }
}