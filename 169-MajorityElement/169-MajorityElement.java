// Last updated: 30/05/2026, 00:05:50
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
    int count = 0;

    for (int num : nums) {
        if (count == 0) {
            candidate = num;
        }
        count += (num == candidate) ? 1 : -1;
    }

    return candidate;
    }
}