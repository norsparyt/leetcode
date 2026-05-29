// Last updated: 30/05/2026, 00:05:05
class Solution {
    public int totalHammingDistance(int[] nums) {
        int ham=0;
        int k;
        for(int i=0;i<32;i++){
            k =0;
            for(int j=0;j<nums.length;j++){
                k=k+((nums[j]>>i)&1);
            }
            ham=ham + k*(nums.length-k);
        }
        return ham;
    }
}