// Last updated: 13/08/2026, 17:53:15
// O(1) space by remembering last value outside loop.
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
17    public int findBottomLeftValue(TreeNode root) {
18        int bottomleft = 0;
19        Queue<TreeNode> q = new LinkedList<>();
20        q.add(root);
21        while(!q.isEmpty()){
22            int size = q.size();
23            bottomleft = q.peek().val;
24            while(size>0){
25                TreeNode curr = q.remove();
26                if(curr.left!=null)
27                    q.add(curr.left);
28                if(curr.right!=null)
29                    q.add(curr.right);
30                size--;
31            }
32        }
33        return bottomleft;
34    }
35}