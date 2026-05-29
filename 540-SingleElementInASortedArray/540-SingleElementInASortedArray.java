// Last updated: 30/05/2026, 00:04:58
class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        int l=0,r=nums.length-1,m;
        while(l<=r){
            //note why = sign
            m=l+(r-l)/2;
            // if(m!=0&&nums[m]==nums[m-1]){
            //     if(m%2==0) r=m-1;
            //     else l=m+1;
            // }
            // else if(m!=(nums.length-1)&&nums[m]==nums[m+1]){
            //     if(m%2==0) l=m+1;
            //     else r=m-1; 
            // }
            // else return nums[m];
            //works but condition heave
            if(m!=(nums.length-1)&&nums[m]==nums[m^1]) l=m+1;
            else r=m-1;
        }
        return nums[l];
    }
}