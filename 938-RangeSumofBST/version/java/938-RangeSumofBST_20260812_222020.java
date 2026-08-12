// Last updated: 12/08/2026, 22:20:20
// Searching in BST: straightforward
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
17    public int rangeSumBST(TreeNode root, int low, int high) {
18        if(root == null)
19            return 0;
20        if(root.val <= high && root.val >=low){
21            return root.val+rangeSumBST(root.left, low, high)+rangeSumBST(root.right, low, high);
22        } 
23        else if(root.val > high ) 
24            return rangeSumBST(root.left, low, high);
25        else
26            return rangeSumBST(root.right, low, high);
27    }
28}