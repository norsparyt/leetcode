// Last updated: 19/06/2026, 07:17:47
// 2 Pointer solution of 2 Sum for constant space.
1class Solution {
2    public int[] twoSum(int[] arr, int target) {
3        int[] ans = new int[2];
4        int left = 0, right = arr.length - 1;
5        while (left < right) {
6            int sum = arr[left] + arr[right];
7            if (sum == target){
8                ans[0]=left+1;
9                ans[1]=right+1;
10                return ans;
11            }
12            else if (sum < target)
13                left++; 
14            else
15                right--;
16        }
17        return ans;
18    }
19}