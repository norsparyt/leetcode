// Last updated: 30/05/2026, 00:04:03
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int frequency=map.getOrDefault(nums[i],0);
            count+=frequency;
            map.put(nums[i],frequency+1);
        }
        return count;
    }
}