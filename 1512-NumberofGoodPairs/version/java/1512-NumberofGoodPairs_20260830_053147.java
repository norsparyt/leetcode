// Last updated: 30/08/2026, 05:31:47
// Count in freq arraya = identical numbers have I already seen = how many new pairs this number creates
1class Solution {
2    public int numIdenticalPairs(int[] nums) {
3        int[] freq = new int[101];
4        int count = 0;
5        for (int num : nums) {
6            count += freq[num];
7            freq[num]++;
8        }
9        return count;
10    }
11}