// Last updated: 26/06/2026, 21:00:17
/*
 * Hashset Soln
 * caveat:
 * 1. Using hashset since O(1) soln
 * 2. iterating over the set itself(and checking if curr -1 exists in it and starting a loop then)
*/

1class Solution {
2    public int longestConsecutive(int[] nums) {
3        Set<Integer> set = new HashSet<>();
4        for(int num: nums)
5            set.add(num);
6        int length = 0;
7        int max_length = 0;
8        for(int num : set){
9            if(!set.contains(num-1)) {
10                int curr = num;
11                length = 0;
12                while(set.contains(curr)){
13                    length++;
14                    curr++;
15                }
16                max_length = Math.max(max_length, length);
17            }
18        }
19        return max_length;
20    }
21}