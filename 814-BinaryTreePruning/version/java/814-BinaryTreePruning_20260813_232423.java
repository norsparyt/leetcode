// Last updated: 13/08/2026, 23:24:23
/*
 * Ideal Code: 
 * Reattach the trimmed subtrees back to root.left and root.right
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
17    public TreeNode pruneTree(TreeNode root) {
18        if (root == null)
19            return null;
20        root.left = pruneTree(root.left);
21        root.right = pruneTree(root.right);
22        if(root.left==null && root.right== null)
23            return(root.val == 0) ? null : root;
24        return root;
25    }
26}