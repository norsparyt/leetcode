// Last updated: 30/05/2026, 00:03:48
class Solution {
    public int[] rearrangeArray(int[] nums) {
        //On extra space
        // int[] pos=new int[nums.length/2];
        // int[] neg=new int[nums.length/2];
        // int p=0,n=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>0) {
        //         pos[p++]=nums[i];
        //     }
        //     else{
        //         neg[n++]=nums[i];
        //     }
        // }
        // for(int i=0;i<nums.length;i++){
        //     if(i%2==0) nums[i]=pos[i/2];
        //     else nums[i]=neg[i/2];
        // }
        // return nums;

        int[] res=new int[nums.length];
        int pos=0,neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res[pos]=nums[i];
                pos=pos+2;
            }
            else{
                res[neg]=nums[i];
                neg=neg+2;
            }
        }
        return res;
    }
}