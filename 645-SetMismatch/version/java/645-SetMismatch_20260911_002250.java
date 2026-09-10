// Last updated: 11/09/2026, 00:22:50
// O(n) time and O(1) space: in place approach
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[2];
5        for(int i=0;i <n;i++){
6            int val = Math.abs(nums[i]);
7            if(nums[val-1] < 0) 
8                ans[0] = val;
9            else
10                nums[val-1] *= -1;
11        }
12        for(int i=0;i <n;i++){
13            if(nums[i] > 0) {
14                ans[1] = i+1;
15                break;
16            }
17        }
18        return ans;
19    }
20}