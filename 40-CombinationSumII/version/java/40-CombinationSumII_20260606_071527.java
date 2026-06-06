// Last updated: 06/06/2026, 07:15:27
/*
 * standard backtracking: 
 * 1. used array concept
 * 2. index for tracking loop start
*/

1class Solution {
2    int sum;
3
4    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
5        sum = 0;
6        List<List<Integer>> ans = new ArrayList<>();
7        List<Integer> res = new ArrayList<>();
8        boolean[] used = new boolean[candidates.length];
9        Arrays.sort(candidates);
10        solve(0, res, ans, candidates, target, used);
11        return ans;
12    }
13
14    void solve(int index, List<Integer> res, List<List<Integer>> ans, int[] arr, int target, boolean[] used) {
15        if (sum == target)
16            ans.add(new ArrayList<>(res));
17        if (sum > target)
18            return;
19        for (int i = index; i < arr.length; i++) {
20            if (i > 0 && arr[i] == arr[i - 1] && !used[i - 1])
21                continue;
22            //!used[i - 1] signifies: 
23            //used and released the duplicate at index i-1 so skip this
24            sum += arr[i];
25            res.add(arr[i]);
26            used[i] = true;
27            solve(i + 1, res, ans, arr, target, used);
28
29            sum -= arr[i];
30            res.removeLast();
31            used[i] = false;
32        }
33    }
34}