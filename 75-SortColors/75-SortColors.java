// Last updated: 30/05/2026, 00:06:27
class Solution {
    public void sortColors(int[] nums) {
        int i=0,j=0,k=nums.length-1;
        while(i<=k){
            // System.out.println(Arrays.toString(nums));
            if(nums[i]==0){
                swap(nums,i,j);
                i++;j++;
            }
            else if(nums[i]==1){
                i++;
            }
            else{
                swap(nums, i, k);
                k--;
            }
        }
    }
    void swap(int[] nums, int a, int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}