// Last updated: 09/08/2026, 03:32:59
/*
 * Backtracking:
 * Remove only once at the end
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
17    List<Integer> ans;
18    List<String> res;
19    public List<String> binaryTreePaths(TreeNode root) {
20        ans = new ArrayList<>();
21        res = new ArrayList<>();
22        if(root==null) return res;
23        path(root);
24        return res;
25    }
26    void path(TreeNode root){
27        ans.add(root.val);
28        if(root.left==null && root.right==null){
29            String p = "";
30            for(int i=0; i< ans.size()-1;i++){
31                p = p + ans.get(i) + "->";
32            }
33            res.add(p+ans.get(ans.size()-1));
34        }
35        if(root.left!=null)
36            path(root.left);
37        if(root.right!=null)
38            path(root.right);
39        ans.removeLast();
40    }
41}