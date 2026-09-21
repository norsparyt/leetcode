// Last updated: 21/09/2026, 22:27:47
/*
 * MinHeap Solution: 
 * add - O(logk)
 * O(N log k) - n= size of nums
*/

1class KthLargest {
2    PriorityQueue<Integer> minHeap;
3    int k;
4    public KthLargest(int k, int[] nums) {
5        this.k = k;
6        minHeap = new PriorityQueue<>();
7        for (int e : nums) {
8            add(e);
9        }
10    }
11    public int add(int val) {
12        if(minHeap.size()<k){
13            minHeap.add(val);
14        }
15        else{
16            if(minHeap.peek() < val){
17                minHeap.poll();
18                minHeap.add(val);
19            }
20        }
21        return minHeap.peek();
22    }
23}
24
25/**
26 * Your KthLargest object will be instantiated and called as such:
27 * KthLargest obj = new KthLargest(k, nums);
28 * int param_1 = obj.add(val);
29 */