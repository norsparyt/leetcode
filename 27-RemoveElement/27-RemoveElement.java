// Last updated: 30/05/2026, 00:07:06
class Solution {
    public int removeElement(int[] nums, int val) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            if(nums[left]==val){
                nums[left]=nums[right];
                right--;
            }
            else left++;
        }
        return right+1;
}}