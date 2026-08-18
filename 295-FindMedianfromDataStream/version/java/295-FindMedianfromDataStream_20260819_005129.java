// Last updated: 19/08/2026, 00:51:29
1class MedianFinder {
2    PriorityQueue<Integer> max;
3    PriorityQueue<Integer> min;
4
5    public MedianFinder() {
6        max = new PriorityQueue<>(Collections.reverseOrder());
7        min = new PriorityQueue<>();
8    }
9
10    public void addNum(int num) {
11        max.add(num);
12        min.add(max.peek());
13        max.poll();
14
15        if (min.size() > max.size()) {
16            max.add(min.peek());
17            min.poll();
18        }
19    }
20
21    public double findMedian() {
22        if (max.size() > min.size())
23            return max.peek();
24        return (max.peek() + min.peek()) / 2.0; //else
25    }
26}
27
28/**
29 * Your MedianFinder object will be instantiated and called as such:
30 * MedianFinder obj = new MedianFinder();
31 * obj.addNum(num);
32 * double param_2 = obj.findMedian();
33 */