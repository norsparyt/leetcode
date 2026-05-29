// Last updated: 30/05/2026, 00:06:58
class Solution {
    public int search(int[] nums, int target) {

        int l = 0, r = nums.length - 1;
        int m;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (nums[m] == target)
                return m;
            if (nums[m] <= nums[r]) {
                //right is sorted
                if (nums[m] < target && nums[r] >= target)
                    l = m + 1;
                else
                    r = m - 1;
            } else if (nums[m] >= nums[l]) {
                //left is sorted
                if (nums[m] > target && nums[l] <= target)
                    r = m - 1;
                else
                    l = m + 1;
            }
        }
        return -1;
        // BRO MIND THE INEQUALITY CHECKS; TAKE THEM SERIOUSLY
    }
}