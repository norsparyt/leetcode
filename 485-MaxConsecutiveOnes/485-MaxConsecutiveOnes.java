// Last updated: 30/05/2026, 00:05:02
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        return max;
    }
}