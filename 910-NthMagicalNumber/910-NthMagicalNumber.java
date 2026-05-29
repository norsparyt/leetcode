// Last updated: 30/05/2026, 00:04:26
class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
        long d=(long)Math.pow(10,9)+7;
        long l=Math.min(a,b);
        long r=n*l;
        long lcm=a*b/hcf(a,b);
        while(l<r){
            long mid=l+(r-l)/2;
            long ans = mid/a +mid/b - mid/lcm;
            if(ans<n) l=mid+1;
            else r=mid;
        }
        return (int)(l%d);
    }
    int hcf(int a , int b){
        if(b%a==0) return a;
        int divisor=a;
        int dividend=b;
        int remainder=dividend%divisor;
        while(remainder!=0){
            dividend=divisor;
            divisor=remainder;
            remainder=dividend%divisor;
        }
        return divisor;
    }
}