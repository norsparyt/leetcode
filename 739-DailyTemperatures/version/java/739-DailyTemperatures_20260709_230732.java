// Last updated: 09/07/2026, 23:07:32
/*
 * Monotonic Stack : 
 * Caveat;
 * 1. Storing indexes in the stack instead of temperatures so you can calculate the next greater element using the formula current index minus index of top of stack.
 * 2. Minding the duplicate equality.
 * 3. The intuition for stack because we need the first previous greater element.
*/

1class Solution {
2    public int[] dailyTemperatures(int[] temp) {
3        Deque<Integer> stack = new ArrayDeque<>();
4        int[] ans = new int[temp.length];
5        for(int i = temp.length-1; i>=0; i--){
6            while(!stack.isEmpty() && temp[i] >= temp[stack.peek()]){
7                stack.pop();
8            }
9            // if(stack.isEmpty()){
10            //     ans[i] = 0;
11            // } redundant since array value is already 0
12            if(!stack.isEmpty()){
13                ans[i] = stack.peek() - i;
14            }
15            stack.push(i);
16        }
17        return ans;
18    }
19}