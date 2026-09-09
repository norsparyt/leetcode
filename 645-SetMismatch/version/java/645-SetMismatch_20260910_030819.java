// Last updated: 10/09/2026, 03:08:19
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int n = nums.length;
4        int[] arr = new int[n];
5        int[] ans = new int[2];
6        for(int i=0;i <n;i++){
7            arr[nums[i]-1]++;
8        }
9        for(int i=0;i <n;i++){
10            if(arr[i] == 2) ans[0] = i+1;
11            else if(arr[i] == 0) ans[1] = i+1;
12        }
13        return ans;
14    }
15}