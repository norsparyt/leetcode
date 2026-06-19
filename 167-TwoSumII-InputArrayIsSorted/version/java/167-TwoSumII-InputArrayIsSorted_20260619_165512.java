// Last updated: 19/06/2026, 16:55:12
/*
 * Binary Search Solution:
 * N * logn(binary)
 * Good for understanding sorted array perks of binary.
 * better approach is 2 pointers end to end.
*/

1class Solution {
2    public int[] twoSum(int[] arr, int target) {
3        int left, right,mid;
4        int n= arr.length;
5        for(int i=0; i < n-1;i++){
6            left = i+1; right = n-1;
7            int complement = target - arr[i];
8            while (left <= right) {
9                mid = left + (right - left)/2;
10                if (arr[mid] == complement)
11                    return new int[] {i+1,mid+1};
12                else if (arr[mid] > complement)
13                    right = mid-1;
14                else
15                    left = mid + 1;
16            }
17        }
18        return new int[]{-1,-1};
19    }
20}