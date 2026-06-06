// Last updated: 06/06/2026, 06:52:15
/*
 * Simple backtracking, combination of 2 caveats : 
 * 1. backtracking standard structure
 * 2. passing of index variable to track - start point
*/

1class Solution {
2    int sum;
3    public List<List<Integer>> combinationSum(int[] candidates, int target) {
4        sum = 0;
5        List<List<Integer>> ans = new ArrayList<>();
6        List<Integer> res = new ArrayList<>();
7        solve(0, res, ans, candidates, target);
8        return ans;
9    }
10    void solve(int index, List<Integer> res, List<List<Integer>> ans, int[] arr, int target){
11        if(sum == target)
12            ans.add(new ArrayList<>(res));
13        if(sum > target)
14            return;
15        for( int i=index; i < arr.length; i++){
16            sum += arr[i];
17            res.add(arr[i]);
18            
19            solve(i, res, ans, arr, target);
20            
21            sum-=arr[i];
22            res.removeLast();
23        }
24    }
25}