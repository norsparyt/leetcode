// Last updated: 12/06/2026, 02:29:12
1class Solution {
2    public List<Integer> findClosestElements(int[] arr, int k, int x) {
3        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
4                (a, b) -> {
5                    int distA= Math.abs(a-x);
6                    int distB= Math.abs(b-x);
7                    if(distA == distB)
8                        return Integer.compare(b, a);
9                    return Integer.compare(distB, distA);
10                    });
11        for (int e : arr) {
12            maxHeap.add(e);
13            if (maxHeap.size() > k)
14                maxHeap.poll();
15        }
16        List<Integer> ans= new ArrayList<>();
17        while (k > 0){
18            ans.add(maxHeap.poll());
19            k--;
20        }
21        Collections.sort(ans);
22        return ans;
23    }
24}