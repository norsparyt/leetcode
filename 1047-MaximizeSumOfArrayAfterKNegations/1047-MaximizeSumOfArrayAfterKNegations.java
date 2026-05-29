// Last updated: 30/05/2026, 00:04:18
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n && k>0 && nums[i]<0; i++){
            nums[i]*=-1;
            k--;
        }
        int sum=0;
        for (int e: nums){
            sum+=e;
        }
        k%=2;
        if(k==0) return sum;
        int minIndex=0;
        for(int i=0;i<n; i++){
            if(nums[i]<nums[minIndex]) minIndex=i;
        }
        return sum-2*nums[minIndex];
    }
}