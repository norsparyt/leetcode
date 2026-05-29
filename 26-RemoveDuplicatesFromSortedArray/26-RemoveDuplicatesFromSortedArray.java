// Last updated: 30/05/2026, 00:07:07
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        // int same=0,diff=1;
        // int[] result=new int[nums.length];
        // result[0]=nums[0];
        // int k=1;
        // while(diff<nums.length){
        //     if(nums[same]!=nums[diff]){
        //         result[k]=nums[diff];
        //         same=diff;
        //         diff=diff+1;
        //         k++;
        //     }
        //     else{
        //         diff++;
        //     }
        // }
        // for(int i=0;i<k;i++){
        //     nums[i]=result[i];
        // }
        // return k;
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}