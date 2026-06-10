// Last updated: 11/06/2026, 00:52:44
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int l = 0, r = nums.length-1;
4        while(l<=r){
5            if(nums[l]%2==0)
6                l++;
7            else{
8                int temp = nums[l];
9                nums[l] = nums[r];
10                nums[r] = temp;
11                r--;
12            }
13        }
14        return nums;
15    }
16}