// Last updated: 10/07/2026, 17:28:00
/*
 * ArrayList Implementation:
 * Caveats:
 * 1. no need to maintain a monotonic stack
 * 2. storing the min index along with the value at each node of the stack
 * 3. handling pop for min index carefully
*/

1class MinStack {
2    List<Pair> stack;
3    int top;
4    int minIndex;
5
6    public MinStack() {
7        stack = new ArrayList<>();
8        top = -1;
9        minIndex = -1;
10    }
11
12    public void push(int value) {
13        top++;
14        if (stack.size() == 0 || value < stack.get(minIndex).val)
15            minIndex = top;
16        stack.add(new Pair(value, minIndex));
17    }
18
19    public void pop() {
20        top--;
21        if (stack.size()==0){
22            minIndex = -1;
23            return;
24        }
25        stack.removeLast();
26        minIndex = (stack.size()==0)? -1 : stack.get(stack.size()-1).min;
27    }
28
29    public int top() {
30        return stack.get(top).val;
31    }
32
33    public int getMin() {
34        return stack.get(minIndex).val;
35    }
36}
37
38class Pair {
39    int val;
40    int min;
41
42    Pair(int val, int min) {
43        this.val = val;
44        this.min = min;
45    }
46}
47/**
48 * Your MinStack object will be instantiated and called as such:
49 * MinStack obj = new MinStack();
50 * obj.push(value);
51 * obj.pop();
52 * int param_3 = obj.top();
53 * int param_4 = obj.getMin();
54 */