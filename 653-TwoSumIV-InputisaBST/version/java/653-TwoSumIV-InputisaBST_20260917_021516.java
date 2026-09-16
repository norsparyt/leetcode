// Last updated: 17/09/2026, 02:15:16
// hashset single pass solution o(n) sc and tc
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
17    public boolean findTarget(TreeNode root, int k) {
18        Set<Integer> set = new HashSet<>();
19        return dfs(root, k, set);
20    }
21    boolean dfs(TreeNode root, int k, Set<Integer> set){
22        if(root == null) 
23            return false;
24        if(set.contains(k - root.val))
25            return true;    
26        set.add(root.val);
27        return dfs(root.left, k , set) || dfs(root.right, k , set);
28    }
29}