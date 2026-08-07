// Last updated: 07/08/2026, 17:16:33
/*
 * Backtracking Soln: 
 * 1. dont prune early based on currsum>targetsum since -ve values
 * 2. slight modif of path sum 1.
*/

1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    List<List<Integer>> ans;
18
19    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
20        ans = new ArrayList<>();
21        List<Integer> path = new ArrayList<>();
22        if (root == null)
23            return ans;
24        sum(root, targetSum, 0, path);
25        return ans;
26    }
27
28    void sum(TreeNode root, int targetSum, int curr, List<Integer> path) {
29        path.add(root.val);
30        if (root.left == null && root.right == null) {
31            if (curr + root.val == targetSum) {
32                ans.add(new ArrayList<>(path));
33            }
34            return;
35        }
36        if (root.left != null) {
37            // path.add(root.left.val);
38            sum(root.left, targetSum, curr + root.val, path);
39            path.removeLast();
40        }
41        if (root.right != null) {
42            // path.add(root.left.val);
43            sum(root.right, targetSum, curr + root.val, path);
44            path.removeLast();
45        }
46    }
47}