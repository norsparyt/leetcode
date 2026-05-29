// Last updated: 30/05/2026, 00:06:56
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1,last=-1;
        if(nums.length==0)return new int[]{first,last};
        int l=0,r=nums.length-1;
        int m;
        while(l<=r){
            System.out.println(l+" "+r);
            m=l+(r-l)/2;
            if(nums[m]==target) {r=m-1; first=m;}
            else if(nums[m]>target) r=m-1;
            else l=m+1;
        }
        System.out.println();
        l=0;r=nums.length-1;
         while(l<=r){
            System.out.println(l+" "+r);
            m=l+(r-l)/2;
            if(nums[m]==target) {l=m+1; last=m;}
            else if(nums[m]>target) r=m-1;
            else l=m+1;
        }
        return new int[]{first,last};
    }
}