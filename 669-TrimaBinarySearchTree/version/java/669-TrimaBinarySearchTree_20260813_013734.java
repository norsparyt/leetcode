// Last updated: 13/08/2026, 01:37:34
// Recursion : logic based
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
17    public TreeNode trimBST(TreeNode root, int low, int high) {
18        return trim(root, low, high);
19    }
20
21    TreeNode trim(TreeNode root, int low, int high) {
22        if (root == null)
23            return root;
24        if (root.left != null) {
25            if (root.left.val < low){
26                root.left = root.left.right;
27                trim(root, low, high);
28            }
29        }
30        if (root.right != null) {
31            if (root.right.val > high){
32                root.right = root.right.left;
33                trim(root, low, high);
34            }
35        }
36        root.left = trim(root.left, low, high);
37        root.right = trim(root.right, low, high);
38        if (root.val > high)
39            return root.left;
40        if (root.val < low)
41            return root.right;
42        return root;
43    }
44}