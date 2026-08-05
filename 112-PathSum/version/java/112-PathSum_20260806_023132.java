// Last updated: 06/08/2026, 02:31:32
// Basic Recursion
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
17    boolean ans;
18
19    public boolean hasPathSum(TreeNode root, int targetSum) {
20        if (root == null)
21            return false;
22        ans = false;
23        sum(root, targetSum, 0);
24        return ans;
25    }
26
27    void sum(TreeNode root, int targetSum, int curr) {
28        if (root.left == null && root.right == null) {
29            if (curr + root.val == targetSum)
30                ans = true;
31        }
32        if (root.right != null)
33            sum(root.right, targetSum, curr + root.val);
34        if (root.left != null)
35            sum(root.left, targetSum, curr + root.val);
36    }
37}