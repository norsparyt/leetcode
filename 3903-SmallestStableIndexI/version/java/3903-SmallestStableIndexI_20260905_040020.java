// Last updated: 05/09/2026, 04:00:20
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n = nums.length;
4
5        int[] suffixMin = new int[n];
6
7        suffixMin[n - 1] = nums[n - 1];
8
9        for (int i = n - 2; i >= 0; i--) {
10
11            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
12
13        }
14
15        int prefixMax = Integer.MIN_VALUE;
16
17        for (int i = 0; i < n; i++) {
18
19            prefixMax = Math.max(prefixMax, nums[i]);
20
21            if (prefixMax - suffixMin[i] <= k) {
22
23                return i;
24
25            }
26
27        }
28
29        return -1;
30    }
31}