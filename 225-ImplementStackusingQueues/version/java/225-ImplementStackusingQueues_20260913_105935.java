// Last updated: 13/09/2026, 10:59:35
/*
 * Approach 1: O(n) push and O(1) pop with 2 queues
 * (other approach is easier which involves just direct addition to a single queue while maintaining a last inserted element: we empty the first queue until only one element remains, then put all the elements in the second queue, and so on.)
*/

1class MyStack {
2    // there are 2 ways to do this with 2 queues : O(n) push with O(1) pop or O(n) pop with O(1) push
3    Queue<Integer> q1;
4    Queue<Integer> q2;
5    public MyStack() {
6        q1 = new LinkedList<>(); //primary queue
7        q2 = new LinkedList<>(); //has top element first
8    }
9    // This approach uses push because we will modify this approach to use a single queue later. 
10    public void push(int x) {
11        q2.add(x);
12        while(q1.size()>0){
13            int top = q1.poll();
14            q2.add(top);
15        }
16        Queue<Integer> temp = q1;
17        q1 = q2;
18        q2 = temp;
19    }
20    
21    public int pop() {
22        return q1.poll();
23    }
24    
25    public int top() {
26        return q1.peek();
27    }
28    
29    public boolean empty() {
30        return q1.isEmpty(); 
31    }
32}
33
34/**
35 * Your MyStack object will be instantiated and called as such:
36 * MyStack obj = new MyStack();
37 * obj.push(x);
38 * int param_2 = obj.pop();
39 * int param_3 = obj.top();
40 * boolean param_4 = obj.empty();
41 */