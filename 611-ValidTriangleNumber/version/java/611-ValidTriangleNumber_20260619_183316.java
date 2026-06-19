// Last updated: 19/06/2026, 18:33:16
/*
 * Break into two parts:
 * 1. sort the array and fix the greatest element as k
 * 2. now apply 2 sum logic where arr[i] +arr[j] >k and <k
 * also add count appropriately since if it satisfies at i, it will satisfy at all indexes between i and j
*/

1class Solution {
2    public int triangleNumber(int[] nums) {
3        Arrays.sort(nums);
4        int i,j, count = 0;
5        int n = nums.length;
6        for (int k = n-1; k>1; k--) {
7            i=0; j=k-1;
8            while (i < j) {
9                if (nums[i] + nums[j] > nums[k]) {
10                    count += j-i;
11                    j--;
12                } else {
13                    i++;
14                }
15            }
16        }
17        return count;
18    }
19}