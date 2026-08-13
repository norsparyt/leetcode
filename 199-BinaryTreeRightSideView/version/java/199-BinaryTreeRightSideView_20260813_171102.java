// Last updated: 13/08/2026, 17:11:02
// BFS: Level Order Traversal
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
17    public List<Integer> rightSideView(TreeNode root) {
18        List<Integer> list = new ArrayList<>();
19        if(root == null) return list;
20        Queue<TreeNode> q = new LinkedList<>();
21        q.add(root);
22        while(!q.isEmpty()){
23            int size = q.size();
24            while(size>0){
25                TreeNode curr = q.remove();
26                if(size==1)
27                    list.add(curr.val);
28                if(curr.left!=null)
29                    q.add(curr.left);
30                if(curr.right!=null)
31                    q.add(curr.right);
32                size--;
33            }
34        }
35        return list;
36    }
37}