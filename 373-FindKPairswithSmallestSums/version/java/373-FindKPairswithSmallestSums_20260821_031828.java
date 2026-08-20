// Last updated: 21/08/2026, 03:18:28
/*
 * Most Optimised MinHeap:
 * No need of Visited. Just go one way so no duplicate adding.
*/

1class Solution {
2    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
3        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->a[0]-b[0]);
4        List<List<Integer>> ans = new ArrayList<>();
5        int m = nums1.length;
6        int n = nums2.length;
7        int[] first = {nums1[0]+nums2[0], 0, 0};
8        //add the entire first row
9        for(int i = 0; i< nums1.length; i++){
10            minHeap.add(new int[]{nums1[i] + nums2[0], i, 0});
11        }
12        while(!minHeap.isEmpty() && k-->0){
13            //pop the min element and add to ans
14            int[] min = minHeap.poll();
15            int i = min[1];
16            int j = min[2];
17            List curr = new ArrayList();
18            curr.add(nums1[i]);
19            curr.add(nums2[j]);
20            ans.add(curr);
21            
22            //try to push - only - (i, j+1) if not visited already and within bounds
23            if(j+1<n){
24                minHeap.add(new int[]{nums1[i] + nums2[j+1], i, j+1});
25            }
26            // (no need to go both ways now to push i+1, j)
27            // if((i+1)<m && !(visited.contains((i+1)+","+j))){
28            //     minHeap.add(new int[]{nums1[i+1] + nums2[j], i+1, j});
29            //     visited.add((i+1)+","+j);
30            // }
31        }
32        return ans;
33    }
34}