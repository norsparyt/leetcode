// Last updated: 09/08/2026, 03:00:29
/*
 * Single Traversal Recursion: O(n) and O(1)
 * Return null, root or left or right based on if one is matching or not
*/

1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
12        if (root == null)
13            return null;
14        if(root == p|| root == q) 
15            return root;
16        TreeNode left = lowestCommonAncestor(root.left, p, q);
17        TreeNode right = lowestCommonAncestor(root.right, p, q);
18        if (left != null && right != null){
19            return root;
20        } 
21        if(left!=null) return left;
22        else return right;
23    }
24}