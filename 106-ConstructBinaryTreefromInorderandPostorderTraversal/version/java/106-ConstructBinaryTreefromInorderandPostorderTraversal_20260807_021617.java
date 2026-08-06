// Last updated: 07/08/2026, 02:16:17
/*
 * Recursion + HashMap:
 * Caveats:
 * 1. using boundaries for array splitting
 * 2. noting that last ele of postorder is always root
 * 3. splitting based on index of postorder ele in inorder
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
17    Map<Integer, Integer> map ;
18    public TreeNode buildTree(int[] inorder, int[] postorder) {
19        map = new HashMap<>();
20        for(int i = 0; i < inorder.length; i++){
21            map.put(inorder[i],i);
22        }
23        return solve(inorder, postorder, 0, inorder.length-1, 0 , postorder.length - 1);
24    }
25    TreeNode solve(int[] inorder, int[] postorder, int iStart, int iEnd, int pStart, int pEnd) {
26        if(iStart>iEnd || pStart>pEnd) return null;
27
28        int rootval = postorder[pEnd];
29        TreeNode root = new TreeNode(rootval);
30        int index = map.get(rootval);
31        int leftElementCount = index - iStart;
32        root.left = solve(inorder, postorder, iStart, index - 1, pStart, pStart + leftElementCount -1);
33        root.right = solve(inorder, postorder, index +1 , iEnd, pStart + leftElementCount, pEnd - 1);
34        return root;
35    }
36}