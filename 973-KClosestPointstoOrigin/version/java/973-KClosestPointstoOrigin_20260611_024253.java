// Last updated: 11/06/2026, 02:42:53
// MinHeap solution. Comapre function use is imp. TC: nlogk
1class Solution {
2    public int[][] kClosest(int[][] points, int k) {
3        //normal approach nlogn - sorting
4        //better approach - quickselect fucntion
5        //best approach - min heap ( remember whenever nlogn needs to be optimised)
6        //also - top k elements needed? min heap of size k hehe
7
8        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
9            (a,b) -> Integer.compare((b[0]*b[0] + b[1]*b[1]), (a[0]*a[0] + a[1]*a[1]))
10        );
11        for(int[] row : points){
12            minHeap.add(row);
13            if(minHeap.size() > k)
14                minHeap.poll();
15        }
16        int[][] ans = new int[k][2];
17        while(k>0)
18            ans[--k] = (minHeap.poll());
19        return ans;
20    }
21}