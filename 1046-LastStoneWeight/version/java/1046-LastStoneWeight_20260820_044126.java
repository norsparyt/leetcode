// Last updated: 20/08/2026, 04:41:26
// MaxHeap Solution: Easy
1class Solution {
2    public int lastStoneWeight(int[] stones) {
3        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
4        for(int e : stones){
5            maxheap.add(e);
6        }
7        while(maxheap.size()>1){
8            int largest = maxheap.poll();
9            int large = maxheap.poll();
10            if(large != largest)
11                maxheap.add(largest - large);
12        }
13        return maxheap.isEmpty() ? 0 : maxheap.poll();
14    }
15}