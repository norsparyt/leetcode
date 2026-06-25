// Last updated: 26/06/2026, 01:27:49
/*
 * MinHeap Approach:
 * easy code but medium intuition,
 * read comments
*/

1class Solution {
2    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
3        List<List<Integer>> ans = new ArrayList<>();
4        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
5            (a,b) -> a[0]-b[0]);
6        int n1 = nums1.length;
7        int n2 = nums2.length;
8        for(int i = 0; i < n1 && i<k; i++){
9            //if k<n1 then only k elements are stored
10            //rest are added through polled heap element no worries
11                int[] pair = {nums1[i] + nums2[0], i, 0}; 
12                minHeap.add(pair);
13        }
14        while(k>0 && !minHeap.isEmpty()){
15            // min heap becomes empty if k> no of pairs present
16            int[] e = minHeap.poll();
17            int i = e[1];
18            int j = e[2];
19            ans.add(List.of(nums1[i], nums2[j]));
20            if(j+1<n2){
21                // this is the key line
22                // this keeps inserting the next j for the polled i of nums1
23                // why? because the polled element is the smallest current pair 
24                //so it tries to all next pair from this i only
25                // if their sum is small they keep coming up(same i) else they go down and we get to another i
26                int[] entry = {nums1[i]+nums2[j+1],i,j+1};
27                minHeap.add(entry);
28            }
29            k--;
30        }
31        return ans;
32    }
33}