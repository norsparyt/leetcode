// Last updated: 30/05/2026, 00:06:31
class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        // return sqrt(x, 1, x / 2);
        int l = 1, r = x / 2;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mid == x / mid)
                return mid;
            else if (mid < x / mid)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return r;
    }

    int sqrt(int x, int l, int r) {
        System.out.println(l + " " + r);
        if (l > r)
            return r;
        int mid = l + (r - l) / 2;
        if (mid <= x / mid)
            return sqrt(x, mid + 1, r);
        else
            return sqrt(x, l, mid - 1);
    }

}