// Last updated: 13/09/2026, 11:03:45
/*
 * Single queue approach. 
 * Caveats: runs an infinite loop if you do not store the size and then add back the elements.
*/

1class MyStack {
2    Queue<Integer> q;
3    public MyStack() {
4        q = new LinkedList<>();
5        //single queue. 
6    }
7    public void push(int x) {
8        q.add(x);
9        int size = q.size();
10        while(size>1){
11            int top = q.poll();
12            q.add(top);
13            size--;
14        }
15    }
16    
17    public int pop() {
18        return q.poll();
19    }
20    
21    public int top() {
22        return q.peek();
23    }
24    
25    public boolean empty() {
26        return q.isEmpty(); 
27    }
28}
29
30/**
31 * Your MyStack object will be instantiated and called as such:
32 * MyStack obj = new MyStack();
33 * obj.push(x);
34 * int param_2 = obj.pop();
35 * int param_3 = obj.top();
36 * boolean param_4 = obj.empty();
37 */