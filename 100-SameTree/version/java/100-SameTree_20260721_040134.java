// Last updated: 21/07/2026, 04:01:34
// Recursive Soln
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
17    public boolean isSameTree(TreeNode p, TreeNode q) {
18        if (p == null && q == null)
19            return true;
20        if ((p == null && q != null) ||
21                (p != null && q == null) ||
22                (p.val != q.val))
23            return false;
24        if (isSameTree(p.left, q.left) && isSameTree(p.right, q.right))
25            return true;
26        else
27            return false;
28    }
29}