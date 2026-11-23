// Last updated: 24/11/2026, 01:08:27
// O(1) space and O(n) time
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] answer = new int[n];
5        answer[0] = nums[0];
6        for(int i = 1; i < n; i++){
7            answer[i] = answer[i-1] * nums[i];
8        }
9        int right = 1;
10        for(int i = n-1; i > 0; i--){
11            answer[i] = answer[i-1] * right; 
12            right *= nums[i];
13        }
14        answer[0] = right;
15        return answer;
16    }
17}