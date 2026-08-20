// Last updated: 20/08/2026, 19:31:30
/*
 * MinHeap Soln:
 * Notes:
 * 1.  push is as imp as poll.
*/

1class Solution {
2    public int largestSumAfterKNegations(int[] nums, int k) {
3        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
4        for(int e: nums){
5            minHeap.add(e);
6        }
7        int sum = 0;
8        while(!minHeap.isEmpty() && k>0){
9            int top = minHeap.poll();
10            top *= -1;
11            minHeap.add(top);
12            k--;
13        }
14        while(!minHeap.isEmpty()){
15            int top = minHeap.poll();
16            sum += top;
17        }
18        return sum;
19    }
20}