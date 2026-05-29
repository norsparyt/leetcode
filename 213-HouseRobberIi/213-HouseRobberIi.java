// Last updated: 30/05/2026, 00:05:33
class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        return Math.max(
            robber(nums, 0, n-1),
            robber(nums, 1, n)
            );
    }
    int robber(int[] nums, int start, int end) {
        //DP 2: TABULATION temp
        int rob1=0;
        int rob2=0;
        //[rob1, rob2, n, n+1....]
        for(int i=start; i<end; i++){
            int temp = Math.max(rob1+nums[i], rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
}