// Last updated: 13/08/2026, 23:17:48
// DFS
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
19            return root;
20        return hasOne(root) ? root : null;
21    }
22
23    boolean hasOne(TreeNode root) {
24        if (root == null)
25            return false;
26        boolean validLeft = hasOne(root.left);
27        boolean validRight = hasOne(root.right);
28        if (!validLeft) {
29            root.left = null;
30        }
31        if (!validRight) {
32            root.right = null;
33        }
34        if (!validLeft && !validRight) {
35            return (root.val == 0) ? false : true;
36        }
37        return true;
38    }
39}