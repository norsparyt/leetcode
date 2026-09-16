// Last updated: 17/09/2026, 00:58:31
/*
 * Two stack solution: 
 * push - O(1)
 * pop - amortized time O(1)
*/

1class MyQueue {
2    Deque<Integer> st1;
3    Deque<Integer> st2;
4    public MyQueue() {
5        st1 = new ArrayDeque<>();
6        st2 = new ArrayDeque<>();
7    }
8    
9    public void push(int x) {
10        st1.push(x);
11    }
12    
13    public int pop() {
14        if(!st2.isEmpty())
15            return st2.pop();
16        while(!st1.isEmpty()){
17            st2.push(st1.pop());
18        }
19        return st2.pop();
20    }
21    
22    public int peek() {
23        if(!st2.isEmpty())
24            return st2.peek();
25        while(!st1.isEmpty()){
26            st2.push(st1.pop());
27        }
28        return st2.peek();
29    }
30    
31    public boolean empty() {
32        return st1.isEmpty()&&st2.isEmpty();
33    }
34}
35
36/**
37 * Your MyQueue object will be instantiated and called as such:
38 * MyQueue obj = new MyQueue();
39 * obj.push(x);
40 * int param_2 = obj.pop();
41 * int param_3 = obj.peek();
42 * boolean param_4 = obj.empty();
43 */