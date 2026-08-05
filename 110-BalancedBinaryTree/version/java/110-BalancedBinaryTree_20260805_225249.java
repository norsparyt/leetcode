// Last updated: 05/08/2026, 22:52:49
/*
 * Optimised Approach:
 * O(n) time and space
 * 1. Calculating height and checking in the same function.
 * 2. Propagating -1 upwards if either of the functions returns -1 or if the difference in height is -1.
 * 3. Calculate height for each node and return it.
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
17    public boolean isBalanced(TreeNode root) {
18        if (root == null)
19            return true;
20        return maxDepth(root) > 0;
21    }
22
23    int maxDepth(TreeNode root) {
24        if (root == null)
25            return 0;
26        int right = maxDepth(root.right);
27        int left = maxDepth(root.left);
28        if (left == -1 || right == -1 || Math.abs(right - left) > 1) {
29            //important to check if any of the functions return -1, we immediately return -1 so that only -1 goes upwards, and we don't release the statement to check the max of left and right. 
30            return -1;
31        } else
32            return 1 + Math.max(left, right);
33    }
34}