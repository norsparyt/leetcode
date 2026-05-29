// Last updated: 30/05/2026, 00:05:45
class Solution {
    public int reverseBits(int n) {
         int result=0;
            for(int i=31;i>=0;i--){
                  result=result<<1;
                  result=result|(n&1);
                  n=n>>1;
            }
      return result;
    }
}