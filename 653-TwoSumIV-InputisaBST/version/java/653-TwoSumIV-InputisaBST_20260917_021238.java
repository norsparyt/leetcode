// Last updated: 17/09/2026, 02:12:38
// hashset : two pass O(n) tc soln
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
19        twosum(root, k, set);
20        return find(root, set);
21    }
22    void twosum(TreeNode root, int k, Set<Integer> set){
23        if(root == null) 
24            return;
25        int second = k - root.val;
26        if(second != root.val)
27            set.add(second);
28        twosum(root.left, k , set);
29        twosum(root.right, k , set);
30    }
31    boolean find(TreeNode root, Set<Integer> set){
32        if(root == null) 
33            return false;
34        if(set.contains(root.val))
35            return true;
36        return find(root.left, set) || find(root.right, set);
37    }
38}