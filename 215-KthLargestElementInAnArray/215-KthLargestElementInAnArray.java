// Last updated: 30/05/2026, 00:05:32
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            minHeap.add(nums[i]);
            //automatically keeps heap sorted internally so no need to call heapify function
            if (minHeap.size() > k)
                minHeap.poll();
        }
        return minHeap.peek();
    }

}