// Last updated: 30/05/2026, 00:04:53
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k)
                count++;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }// note that storing frequency of duplicates is important

            // if (map.containsKey(sum)) {
            //     map.put(sum, map.get(sum) + 1);
            // } else
            //     map.put(sum, 1);
            //------> alternatively use this:
            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }
        return count;
    }
}