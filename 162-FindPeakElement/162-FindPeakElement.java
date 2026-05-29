// Last updated: 30/05/2026, 00:05:53
class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        int m;
        while (l < r) {
            m = l + (r - l) / 2;
            if (nums[m] < nums[m + 1])
                l = m + 1;
            else
                r = m;
        }
        return l;
    }
}