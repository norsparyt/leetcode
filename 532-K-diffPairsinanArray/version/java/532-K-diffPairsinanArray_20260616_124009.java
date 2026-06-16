// Last updated: 16/06/2026, 12:40:09
1class Solution {
2    public int findPairs(int[] nums, int k) {
3        int left = 0, right = 1, count = 0;
4        Arrays.sort(nums);
5        while (right < nums.length && left<nums.length) {
6            if (left==right || nums[right] - nums[left] < k) {
7                right++;
8            } else if (nums[right] - nums[left] > k) {
9                left++;
10            } else {
11                left++;
12                count++;
13                while (left < nums.length && nums[left - 1] == nums[left]) {
14                    left++;
15                }
16            }
17        }
18        return count;
19    }
20}