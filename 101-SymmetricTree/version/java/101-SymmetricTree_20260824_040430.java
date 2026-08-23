// Last updated: 24/08/2026, 04:04:30
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
17    public boolean isSymmetric(TreeNode root) {
18        if (root == null) {
19            return true;
20        }
21        // Start the recursive check with the left and right children
22        return isMirror(root.left, root.right);
23    }
24
25    private boolean isMirror(TreeNode t1, TreeNode t2) {
26        // Base case 1: Both nodes are null, meaning we've reached the leaves perfectly
27        if (t1 == null && t2 == null) {
28            return true;
29        }
30        
31        // Base case 2: One is null and the other isn't, meaning the structure is asymmetric
32        if (t1 == null || t2 == null) {
33            return false;
34        }
35        
36        // Base case 3: The values of the current nodes don't match
37        if (t1.val != t2.val) {
38            return false;
39        }
40        
41        // Recursive step: 
42        // 1. Check the "outer" children (t1's left and t2's right)
43        // 2. Check the "inner" children (t1's right and t2's left)
44        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
45    }
46}