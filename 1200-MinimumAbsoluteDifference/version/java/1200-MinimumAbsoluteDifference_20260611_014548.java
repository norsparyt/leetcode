// Last updated: 11/06/2026, 01:45:48
1class Solution {
2    public List<List<Integer>> minimumAbsDifference(int[] arr) {
3        Arrays.sort(arr);
4        int mind = Integer.MAX_VALUE;
5        for(int i=0; i< arr.length -1; i++){
6            mind = Math.min(mind, arr[i+1]-arr[i]);
7        }
8        List<List<Integer>> ans = new ArrayList<>();
9        for(int i=0; i< arr.length -1; i++){
10            if(arr[i+1]-arr[i] == mind) {
11                List<Integer> pair = new ArrayList<Integer>();
12                pair.add(arr[i]);
13                pair.add(arr[i+1]);
14                ans.add(pair);
15            }
16        }
17        return ans;
18    }
19}