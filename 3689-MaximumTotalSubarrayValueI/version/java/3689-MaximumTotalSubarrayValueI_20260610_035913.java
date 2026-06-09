// Last updated: 10/06/2026, 03:59:13
// What? Easyyy. Trick ques.
1class Solution {
2    public long maxTotalValue(int[] nums, int k) {
3        int n = nums.length;
4        long max = Integer.MIN_VALUE,min=Integer.MAX_VALUE;
5        for (int i=0; i<n; i++){
6            max= Math.max(max, nums[i]);
7            min= Math.min(min, nums[i]);
8        }
9        long ans = (max-min)*(long)k;
10        return ans;
11    }
12}