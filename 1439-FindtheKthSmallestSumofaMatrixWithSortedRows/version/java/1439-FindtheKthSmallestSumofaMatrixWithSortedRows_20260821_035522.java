// Last updated: 21/08/2026, 03:55:22
/*
 * MaxHeap + Arrays : 
 * 1. reusing 373. Find K Pairs with Smallest Sums
 * 2. critical bug of - size of new first row array (all rest become 0 when k> m*n)
*/

1class Solution {
2    public int kthSmallest(int[][] mat, int k) {
3        int [] newFirstRow = mat[0];
4        for(int i = 0; i < mat.length - 1; i++){
5            newFirstRow = kSmallestPairs(newFirstRow, mat[i+1], k);
6        }
7        return newFirstRow[newFirstRow.length-1];
8    }
9    // leetcode 373.
10    public int[] kSmallestPairs(int[] nums1, int[] nums2, int k) {
11        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->a[0]-b[0]);
12        int m = nums1.length;
13        int n = nums2.length;
14        int[] ans = new int[Math.min(k, m*n)];
15        for(int i = 0; i< nums1.length; i++){
16            minHeap.add(new int[]{nums1[i] + nums2[0], i, 0});
17        }
18        int c = 0;
19        while(!minHeap.isEmpty() && k-->0){
20            int[] min = minHeap.poll();
21            int i = min[1];
22            int j = min[2];
23            ans[c++]= nums1[i]+nums2[j];
24            if(j+1<n){
25                minHeap.add(new int[]{nums1[i] + nums2[j+1], i, j+1});
26            }
27        }
28        return ans;
29    }
30}