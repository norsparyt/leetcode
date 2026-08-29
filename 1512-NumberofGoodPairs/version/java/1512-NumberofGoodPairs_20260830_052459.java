// Last updated: 30/08/2026, 05:24:59
// Brute force
1class Solution {
2    public int numIdenticalPairs(int[] nums) {
3        int count = 0;
4
5        for (int i = 0; i < nums.length; i++) {
6            for (int j = i + 1; j < nums.length; j++) {
7                if (nums[i] == nums[j]) {
8                    count++;
9                }
10            }
11        }
12
13        return count;
14    }
15}