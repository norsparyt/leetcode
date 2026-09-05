// Last updated: 06/09/2026, 04:56:11
// Single array soln
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n = nums.length;
4        int[] right = new int[n];
5        int max = Integer.MIN_VALUE;
6        int min = Integer.MAX_VALUE;
7        for(int i = 0; i<n; i++){
8            min = Math.min(min, nums[n-1-i]);
9            right[n-i-1] = min;
10        }
11        for(int i = 0; i<n; i++){
12            max = Math.max(max, nums[i]);
13            int score = max - right[i];
14            if(score <= k)
15                return i;
16        }
17        return -1;
18    }
19}