// Last updated: 19/08/2026, 04:47:42
// Tricky logic, dry run.
1class MedianFinder {
2    PriorityQueue<Integer> max;
3    PriorityQueue<Integer> min;
4
5    public MedianFinder() {
6        //divide array into 2 parts of small and large numbers from middle 
7        // to arrive at their mid (break array from median)
8        max = new PriorityQueue<>(Collections.reverseOrder());
9        min = new PriorityQueue<>();
10    }
11
12    public void addNum(int num) {
13        // add element to max heap if it is small else add it to min heap
14        //(avoiding if else statements and using smart routing)
15        // max element always goes to min heap
16        max.add(num);
17        min.add(max.peek());
18        max.poll();
19        //if min heap becomes greater than max heap (we need to make it = or -1 in size)
20        if (min.size() > max.size()) {
21            max.add(min.peek());
22            min.poll();
23        }
24    }
25
26    public double findMedian() {
27        //if size of max is greater - total length was odd -return highest largest of max heap
28        if (max.size() > min.size())
29            return max.peek();
30        //return avg of both
31        return (max.peek() + min.peek()) / 2.0; //else
32    }
33}
34
35/**
36 * Your MedianFinder object will be instantiated and called as such:
37 * MedianFinder obj = new MedianFinder();
38 * obj.addNum(num);
39 * double param_2 = obj.findMedian();
40 */