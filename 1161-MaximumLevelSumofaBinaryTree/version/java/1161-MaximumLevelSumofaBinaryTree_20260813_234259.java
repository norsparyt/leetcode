// Last updated: 13/08/2026, 23:42:59
// Level Order Traversal
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
17    public int maxLevelSum(TreeNode root) {
18        int ans = 0;
19        int max = Integer.MIN_VALUE;
20        Queue<TreeNode> q = new LinkedList<>();
21        if(root == null) return ans;
22        q.add(root);
23        int level = 1;
24        while (!q.isEmpty()) {
25            int size = q.size();
26            int sum = 0;
27            while (size > 0) {
28                TreeNode front = q.remove();
29                sum += front.val;
30                if (front.left != null)
31                    q.add(front.left);
32                if (front.right != null)
33                    q.add(front.right);
34                size--;
35            }
36            if (sum > max) {
37                max = sum;
38                ans = level;
39            }
40            level++;
41        }
42        return ans;
43    }
44}