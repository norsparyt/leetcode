// Last updated: 30/05/2026, 00:04:06
class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
            {
                sum+=nums[i];
                nums[i]=sum;
            }
        return nums;
    }
}