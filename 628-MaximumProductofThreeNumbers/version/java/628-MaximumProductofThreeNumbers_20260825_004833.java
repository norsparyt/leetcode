// Last updated: 25/08/2026, 00:48:33
/*
 * No overthinking of complex if else:
 * Max is always between largest two -ve nos and greatest +ve vs largest 3 no.s
*/

1class Solution {
2    public int maximumProduct(int[] nums) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        return Math.max(nums[0]*nums[1]*nums[n-1],nums[n-1]*nums[n-2]*nums[n-3]);
6    }
7}