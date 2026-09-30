// Last updated: 01/10/2026, 03:50:55
// BFS - otpimal soln stops at first encounter of leaf node(min depth)
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
17    public int minDepth(TreeNode root) {
18     if (root == null) {
19            return 0;
20        }
21        Queue<TreeNode> queue = new LinkedList<>();
22        queue.offer(root);
23        int depth = 1;
24        while (!queue.isEmpty()) {
25            int levelSize = queue.size();
26            for (int i = 0; i < levelSize; i++) {
27                TreeNode current = queue.poll();
28                if (current.left == null && current.right == null) 
29                    return depth;
30                if (current.left != null) 
31                    queue.offer(current.left);
32                if (current.right != null) 
33                    queue.offer(current.right);
34            }
35            depth++;
36        }
37        return depth;
38    }
39}