// Last updated: 08/06/2026, 22:20:35
/*
 * Simple lomuto partition wont work: swapping is not stable.
 * Do 3 passes and collect types.
*/

1class Solution {
2    public int[] pivotArray(int[] nums, int pivot) {
3        int[] ans = new int[nums.length];
4        int c = 0;
5        for(int e: nums){
6            if(e < pivot)
7                ans[c++] = e;
8        }
9        for(int e: nums){
10            if(e == pivot)
11                ans[c++] = e;
12        }
13        for(int e: nums){
14            if(e > pivot)
15                ans[c++] = e;
16        }
17        return ans;
18    }
19}