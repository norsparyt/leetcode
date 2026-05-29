// Last updated: 30/05/2026, 00:06:49
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(nums, curr, used, res);
        return res;
    }

    void backtracking(int[] nums, List<Integer> curr, boolean[] used, List<List<Integer>> res) {
        if (curr.size() == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            } else {
                if (!used[i]) {
                    //choose
                    curr.add(nums[i]);
                    used[i] = true;
                    //explore
                    backtracking(nums, curr, used, res);
                    //backtrack
                    curr.removeLast();
                    used[i] = false;
                }

            }
        }
    }
}