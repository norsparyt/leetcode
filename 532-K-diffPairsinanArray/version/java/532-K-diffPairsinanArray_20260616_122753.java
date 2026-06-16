// Last updated: 16/06/2026, 12:27:53
/*
 * 2 pointer approach:
 * caveats:
 * both pointers at left - 0 ,1
 * do right++ when left==right (can cause dups issues)
 * skipping only left dups required not right( it lands on a brand new number)
*/

1class Solution {
2    public int findPairs(int[] nums, int k) {
3        int left = 0, right = 1, count = 0;
4        Arrays.sort(nums);
5        while (right < nums.length) {
6            int diff = nums[right] - nums[left];
7            if (left==right || diff < k) {
8                right++;
9            } else if (diff > k) {
10                left++;
11            } else {
12                left++;
13                right++;
14                count++;
15                while (left < nums.length && nums[left - 1] == nums[left]) {
16                    left++;
17                }
18                while (right < nums.length && nums[right - 1] == nums[right]) {
19                    right++;
20                }
21            }
22        }
23        return count;
24    }
25}