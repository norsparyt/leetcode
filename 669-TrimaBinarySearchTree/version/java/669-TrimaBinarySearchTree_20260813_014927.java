// Last updated: 13/08/2026, 01:49:27
/*
 * Cleaner Code
 * Avoids redundant calls.
 * Reattaches return values of calls.
 * Does not need manual work that recursion does automatically.
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
17    public TreeNode trimBST(TreeNode root, int low, int high) {
18        if (root == null)
19            return root;
20        // If the root node is not within range skip it one side entirely
21        if (root.val > high)
22            return trimBST(root.left, low, high);
23        else if (root.val < low)
24            return trimBST(root.right, low, high);
25
26        //trim left and right subtrees and reattach them to the root
27        // - If the root node is within range
28        root.left = trimBST(root.left, low, high);
29        root.right = trimBST(root.right, low, high);
30        return root;
31    }
32}