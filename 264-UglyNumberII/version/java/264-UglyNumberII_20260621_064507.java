// Last updated: 21/06/2026, 06:45:07
// Minheap approach
1class Solution {
2    public int nthUglyNumber(int n) {
3        PriorityQueue<Long> minHeap = new PriorityQueue<>();
4        Set<Long> visited = new HashSet<>();
5        minHeap.offer(1L);
6        visited.add(1L);
7        long current = 1L;
8        int[] factors = {2, 3, 5};
9        for (int i = 0; i < n; i++) {
10            current = minHeap.poll();
11
12            for (int f : factors) {
13                long next = current * f;
14                if (visited.add(next)) {
15                    minHeap.offer(next);
16                }
17            }
18        }
19                return (int) current;
20    }
21}