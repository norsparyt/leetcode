// Last updated: 24/11/2026, 00:41:59
// O(n) time and O(n) space
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] end = new int[n];
5        int[] start = new int[n];
6        end[n-1] = nums[n-1];
7        start[0] = nums[0];
8        for(int i = 1; i < n; i++){
9            start[i] = start[i-1] * nums[i];
10            end[n-1-i] = end[n-i] * nums[n-1-i];
11        }
12        int[] answer = new int[n];
13        answer[0] = end[1];
14        answer[n-1] = start[n-2];
15        for(int i = 1; i < n - 1; i++){
16            answer[i] = start[i-1] * end[i+1];
17        }
18        return answer;
19    }
20}