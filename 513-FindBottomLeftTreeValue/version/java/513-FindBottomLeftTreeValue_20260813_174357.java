// Last updated: 13/08/2026, 17:43:57
// BFS
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
18        List<Integer> list = new ArrayList<>();
19        List<List<Integer>> ans = new ArrayList<>();
20        Queue<TreeNode> q = new LinkedList<>();
21        q.add(root);
22        while(!q.isEmpty()){
23            list = new ArrayList<>();
24            int size = q.size();
25            while(size>0){
26                TreeNode curr = q.remove();
27                list.add(curr.val);
28                if(curr.left!=null)
29                    q.add(curr.left);
30                if(curr.right!=null)
31                    q.add(curr.right);
32                size--;
33            }
34            ans.add(list);
35        }
36        return ans.getLast().get(0);
37    }
38}