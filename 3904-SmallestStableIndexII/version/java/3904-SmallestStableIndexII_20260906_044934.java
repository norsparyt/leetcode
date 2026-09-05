// Last updated: 06/09/2026, 04:49:34
// Double array soln O(n) +O(n)
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n = nums.length;
4        int[] left = new int[n];
5        int[] right = new int[n];
6        int max = Integer.MIN_VALUE;
7        int min = Integer.MAX_VALUE;
8        for(int i = 0; i<n; i++){
9            max = Math.max(max, nums[i]);
10            left[i] = max; 
11            min = Math.min(min, nums[n-1-i]);
12            right[n-i-1] = min;
13        }
14        for(int i = 0; i<n; i++){
15            int score = left[i] - right[i];
16            if(score <= k)
17                return i;
18        }
19        return -1;
20    }
21}