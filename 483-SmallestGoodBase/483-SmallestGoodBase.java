// Last updated: 30/05/2026, 00:05:04
class Solution {
    public String smallestGoodBase(String str) {
        long n = Long.parseLong(str);
        int b=(int)(Math.log(n)/Math.log(2))+1;
        //for max b(digits)->least base->2, applying gp: n=2ˆb-1 ->b=log(n+1)
        for (b = 60; b >= 2; b--) {
            long l = 2L;
            //long r = n - 1; //because any midˆb-1 cant be greater than n
            // long r = (long) Math.pow(n, 1 / (b - 1)) + 1; //doesnt work
            long r = (long) Math.pow(n, 1.0 / (b - 1)) + 1;
            //because baseˆlenght-1 cant be greater than n
            while (l <= r) {
                long mid = l + (r - l) / 2;
                long value = check(mid, b);
                if (value == n) {
                    return String.valueOf(mid);
                } else if (value > n)
                    r = mid - 1;
                else
                    l = mid + 1;
            }
        }
        return String.valueOf(n - 1);
    }

    // OPTIMISATION: under root
    long check(long base, long length) {
        long base_x = 1;
        long sum = 1L;
        for (int i = 1; i < length; i++) {
            if (base_x > Long.MAX_VALUE / base || sum > Long.MAX_VALUE - base_x)
                return Long.MAX_VALUE;
            base_x *= base;
            sum += base_x;
        }
        return sum;
    }
}