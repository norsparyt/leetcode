// Last updated: 30/05/2026, 00:06:04
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res^= nums[i];
        }
        return res;
    }
}