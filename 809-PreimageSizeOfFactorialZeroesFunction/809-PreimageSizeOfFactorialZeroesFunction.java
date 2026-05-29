// Last updated: 30/05/2026, 00:04:34
class Solution {
    public int preimageSizeFZF(int k) {
        if(k==0) return 5;
        ///binary search for finding x for which fx>=k
        long l=0,r=5L*(k+1);
        long mid;
        while(l<r){
            mid=l+(r-l)/2;
            if(getfx(mid)<k) 
                l=mid+1;
            else 
                r=mid;
        }
        if(getfx(l)==k) return 5; else return 0;
    }
    //calc fx=1/5+1/25+1/125....
    long getfx(long x){
        long sum=0;
        long multiplier=5;
        while(x/multiplier!=0){
            sum+=x/multiplier;
            multiplier*=5;
        }
        return sum;
    }
}