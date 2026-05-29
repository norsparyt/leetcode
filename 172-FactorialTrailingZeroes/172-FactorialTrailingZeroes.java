// Last updated: 30/05/2026, 00:05:47
class Solution {
    public int trailingZeroes(int x) {
        long sum=0;
        long multiplier=5;
        while(x/multiplier!=0){
            sum+=x/multiplier;
            multiplier*=5;
        }
        return (int)sum;
    }
}