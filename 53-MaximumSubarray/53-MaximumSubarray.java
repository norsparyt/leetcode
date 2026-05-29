// Last updated: 30/05/2026, 00:06:46
class Solution {
    public int maxSubArray(int[] nums) {
        //method 2- kadane's algorithm
        int currSum = 0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            //either include or start new sum from i
            currSum=Math.max(nums[i],currSum+nums[i]);
            //max till now
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
        
    }
}