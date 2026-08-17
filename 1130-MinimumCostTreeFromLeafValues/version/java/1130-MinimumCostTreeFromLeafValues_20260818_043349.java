// Last updated: 18/08/2026, 04:33:49
/*
 * Monotonic Stack: O(n) time and O(n) space - Most optimal soln
 * Caveats:
 * 1. intuition
 * 2. edge cases (start and end index for outer loop)
 * DRY RUN This to understand. RETRY
*/

1class Solution {
2    public int mctFromLeafValues(int[] arr) {
3        Stack<Integer> st = new Stack<>();
4        int sum = 0;
5        for(int num : arr){
6            //if it is a valley
7            while(!st.isEmpty() && st.peek() <= num){
8                int top = st.pop();
9                if(st.isEmpty())
10                    sum += top * num ; // only option
11                else
12                    sum += top * Math.min(num, st.peek()); //product of 2 min neighbors
13            }
14            st.push(num);//push every loop (note start and end indexes)
15        }
16        // pair all remaining from smallest to greatest
17        while(st.size() > 1){
18            sum += st.pop() * st.peek();
19        }
20        return sum;
21    }
22}