// Last updated: 30/05/2026, 00:03:47
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] twice=new int[2*n];
        int l=0,r=n-1;
        while(l<=r){
            twice[l]=nums[l];
            twice[r]=nums[r];
            twice[l+n]=nums[l];
            twice[r+n]=nums[r];
            l++;r--;
        }
        return twice;
    }
}