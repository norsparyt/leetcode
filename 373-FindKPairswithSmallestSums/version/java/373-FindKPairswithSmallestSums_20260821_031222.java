// Last updated: 21/08/2026, 03:12:22
/*
 * MinHeap Approach: TC = Min k *log(m*n), k logk
 * 1. using visited 
 * 2. using string since pairs are not present in java and hashmap can be overrited for same keys
 * retry - youtube soln
*/

1class Solution {
2    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
3        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->a[0]-b[0]);
4        List<List<Integer>> ans = new ArrayList<>();
5        Set<String> visited = new HashSet<>();
6        int m = nums1.length;
7        int n = nums2.length;
8        int[] first = {nums1[0]+nums2[0], 0, 0};
9        minHeap.add(first);
10        visited.add(0+","+0);
11        while(!minHeap.isEmpty() && k-->0){
12            //pop the min element and add to ans
13            int[] min = minHeap.poll();
14            int i = min[1];
15            int j = min[2];
16            List curr = new ArrayList();
17            curr.add(nums1[i]);
18            curr.add(nums2[j]);
19            ans.add(curr);
20            
21            //try to push i, j+1 if not visited already and within bounds
22            if((j+1)<n && !(visited.contains(i+","+(j+1)))){
23                minHeap.add(new int[]{nums1[i] + nums2[j+1], i, j+1});
24                visited.add(i+","+(j+1));
25            }
26            //try to push i+1, j if not visited already and within bounds
27            if((i+1)<m && !(visited.contains((i+1)+","+j))){
28                minHeap.add(new int[]{nums1[i+1] + nums2[j], i+1, j});
29                visited.add((i+1)+","+j);
30            }
31        }
32        return ans;
33    }
34}