// Last updated: 06/06/2026, 02:53:22
// same as permuations 2 for arrays ( just not limiting to length of array/adding all sets)
1class Solution {
2    public List<List<Integer>> subsetsWithDup(int[] nums) {
3        List<List<Integer>> ans = new ArrayList<>();
4        List<Integer> res = new ArrayList<>();
5        boolean[] used = new boolean[nums.length];
6        Arrays.sort(nums);
7        allSubsets(0, res, ans, nums, used);
8        return ans;
9    }
10
11    void allSubsets(int index, List<Integer> res, List<List<Integer>> ans, int[] nums, boolean[] used) {
12        ans.add(new ArrayList<>(res));
13        for (int i = index; i < nums.length; i++) {
14            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
15                continue;
16            else {
17                if (!used[i]) {
18                    res.add(nums[i]);
19                    used[i]=true;
20
21                    allSubsets(i + 1, res, ans, nums, used);
22                    
23                    res.removeLast();
24                    used[i]=false;
25                }
26            }
27        }
28    }
29}