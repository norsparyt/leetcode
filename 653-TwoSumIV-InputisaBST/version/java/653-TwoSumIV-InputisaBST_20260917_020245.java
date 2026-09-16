// Last updated: 17/09/2026, 02:02:45
/*
 * Recursion: Time - O(nlogn)
 * logn for finding and n for finding for each node
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
17    TreeNode origRoot;
18    public boolean findTarget(TreeNode root, int k) {
19        origRoot = root;
20        return twosum(root, k);
21    }
22    boolean twosum(TreeNode root, int k){
23        if(root == null) 
24            return false;
25        int second = k - root.val;
26        if(second == root.val)
27            return twosum(root.left, k) || twosum(root.right, k);
28        if(find(origRoot, second)) 
29            return true;
30        else
31            return twosum(root.left, k) || twosum(root.right, k);
32    }
33    boolean find(TreeNode root, int x){
34        if(root == null) 
35            return false;
36        if(root.val == x) 
37            return true;
38        else if(root.val > x) 
39            return find(root.left, x);
40        else
41            return find(root.right, x);
42    }
43}