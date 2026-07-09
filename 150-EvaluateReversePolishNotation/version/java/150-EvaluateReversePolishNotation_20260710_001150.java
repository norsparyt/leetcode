// Last updated: 10/07/2026, 00:11:50
/*
 * Stack Solution
 * Caveats:
 * 1. The use of stacks as an intuition to pop out the last two elements whenever we hit an operator.
 * 2. Comparing strings directly to "" characters of +-*/ (This only compares objects in memory, not exact strings.)
*/

1class Solution {
2    public int evalRPN(String[] tokens) {
3        Deque<Integer> stack = new ArrayDeque<>();
4        for(int i = 0; i < tokens.length; i++){
5            char ch = tokens[i].charAt(tokens[i].length()-1);
6            if( ch>= '0' && ch <= '9' ){
7                int n = Integer.parseInt(tokens[i]);
8                stack.push(n);
9            }
10            else {
11                int two = stack.pop();
12                int one = stack.pop();
13                int ans = 0;
14                switch(ch){
15                    case '+' :
16                        ans = one + two; 
17                        break;
18                    case '-' :
19                        ans = one - two;
20                        break;
21                    case '*' :
22                        ans = one * two;
23                        break;
24                    case '/' :
25                        ans = one / two;
26                        break;
27                }
28                stack.push(ans);
29            }
30        }
31        return stack.pop();
32    }
33}