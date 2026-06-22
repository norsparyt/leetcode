// Last updated: 23/06/2026, 01:30:40
1class Solution {
2    public int nthUglyNumber(int n) {
3        //retried by my
4        PriorityQueue<Long> minHeap = new PriorityQueue<>();
5        Map<Long, Boolean> map = new HashMap<>();
6        minHeap.add(1L);
7        map.put(1L, true);
8        long ugly = 1L;
9        long[] factors = { 2, 3, 5 };
10        for (long i = 1; i <= n; i++) {
11            ugly = minHeap.poll();
12            System.out.println(ugly);
13            for (long factor : factors) {
14                long value = factor * ugly;
15                if (!map.containsKey(value)) {
16                    minHeap.add(value);
17                    map.put(value, true);
18                }
19            }
20        }
21        return (int) ugly;
22    }
23}