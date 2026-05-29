// Last updated: 30/05/2026, 00:04:45
class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length==1) return 0;
        if (nums.length==0) return -1;

        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        for(int num:nums)System.out.print(num);
        for(int i=0;i<nums.length;i++){
            if(i==0)
                {
                    if(nums[nums.length-1]==nums[0])
                        return 0;
                }
            else if(nums[i-1]==(nums[nums.length-1]-nums[i]))
                return i;
        }
         return -1;
    }
}