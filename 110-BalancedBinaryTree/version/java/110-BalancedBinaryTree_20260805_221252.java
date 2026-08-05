// Last updated: 05/08/2026, 22:12:52
// Finding height at each level.
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
17    public boolean isBalanced(TreeNode root) {
18        if(root==null) return true;
19        if (Math.abs(maxDepth(root.right) - maxDepth(root.left)) > 1){
20            return false;
21        }
22        return isBalanced(root.left) && isBalanced(root.right);
23    }
24    int maxDepth(TreeNode root){
25        if(root==null) 
26            return 0;
27        else 
28            return Math.max(1 + maxDepth(root.left), 1 + maxDepth(root.right));
29    }
30}