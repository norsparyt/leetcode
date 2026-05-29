// Last updated: 30/05/2026, 00:05:42
class Solution {
    public int rob(int[] nums) {
        //DP 2: TABULATION
        int rob1=0;
        int rob2=0;
        //[rob1, rob2, n, n+1....]
        for(int i=0; i<nums.length; i++){
            int temp = Math.max(rob1+nums[i], rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
}