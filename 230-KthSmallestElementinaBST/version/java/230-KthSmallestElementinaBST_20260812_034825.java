// Last updated: 12/08/2026, 03:48:25
/*
 * InOrder Method
 * Easy.
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
17    int count;
18    int ans;
19    public int kthSmallest(TreeNode root, int k) {
20        count = k;
21        ans = root.val;
22        inOrder(root, k);         
23        return ans;
24    }
25    void inOrder(TreeNode root, int k){
26        if(root == null) return;
27        inOrder(root.left, k);
28        count--;
29        if(count == 0) ans = root.val;
30        inOrder(root.right, k);
31    }
32}