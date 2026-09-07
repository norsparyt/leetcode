// Last updated: 08/09/2026, 02:23:18
/*
 * Greedy : Candidate elimination: O(n) and O(1)
 * 1. we found an index which is satisfies the condition max - min <= k and if all the rest of the indexes that come next also satisfy this condition then this is the answer
 * 2. once we have a canditate we are technically going throught the rest of the array finding only mins for that max till candidate and trying to finish off the array with that assuumed candidate. if we fail we try again
 * 3.  when we find a index i that fails the condition that means: the nums[i] is so small that all our previous calculations are rendered false because their minimum suffix changes with this new minimum that we are just now seeing. so we must start fresh from i+1
*/

1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int max = Integer.MIN_VALUE;
4        int max_till_ans = 0;
5        int ans_index = 0;
6        for (int i = 0; i < nums.length; i++) {
7            max = Math.max(max, nums[i]);
8            //whenever fails condition 
9            if(ans_index == i) 
10                max_till_ans = max;
11            if (!(max_till_ans - nums[i] <= k)) { // written like to better understand
12                //skip to i+1
13                ans_index = i + 1;
14            }
15        }
16        if (ans_index != nums.length)
17            return ans_index;
18        return -1;
19    }
20}