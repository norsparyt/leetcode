// Last updated: 30/05/2026, 00:05:25
class Solution {
    public boolean isPowerOfTwo(int n) {
    //     if(n==1) return true;
    //     return isp(n,1);
    // }
    // boolean isp(int n, int two){
    //     if(two*2>n) return false;

    //     if(two==n) 
    //         return true;
    //     return isp(n,two*2);
    // } causes stackoverflow- essentially a bit manipulation question
    //solving it with loop for now
    if (n == 1) return true;
    if (n <= 0 || n % 2 != 0) return false;
    return isPowerOfTwo(n / 2);
    }
}