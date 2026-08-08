// Last updated: 09/08/2026, 03:37:38
// Simple variation of Binary Tree paths
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
17    int sum;
18    List<Integer> ans;
19    public int sumNumbers(TreeNode root) {
20        sum = 0;
21        ans = new ArrayList<>();
22        if(root==null) return 0;
23        path(root);
24        return sum;
25    }
26    void path(TreeNode root){
27        ans.add(root.val);
28        if(root.left==null && root.right==null){
29            int curr = 0;
30            for(int i=0; i< ans.size();i++){
31                curr = curr*10 + ans.get(i);
32            }
33            sum+=curr;
34        }
35        if(root.left!=null)
36            path(root.left);
37        if(root.right!=null)
38            path(root.right);
39        ans.removeLast();
40    }
41}