// Last updated: 07/08/2026, 02:30:06
/*
 * Recursion+hashmap:
 * 1. same as inorder +postorder question
 * 2. remember to remove root from start boundary of preorder
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
18    public TreeNode buildTree(int[] preorder, int[] inorder) {
19        map = new HashMap<>();
20        for(int i = 0; i < inorder.length; i++){
21            map.put(inorder[i],i);
22        }
23        return solve(inorder, preorder, 0, inorder.length-1, 0 , preorder.length - 1);
24    }
25    TreeNode solve(int[] inorder, int[] preorder, int iStart, int iEnd, int pStart, int pEnd) {
26        if(iStart>iEnd || pStart>pEnd) return null;
27
28        int rootval = preorder[pStart];
29        TreeNode root = new TreeNode(rootval);
30        int index = map.get(rootval);
31        int leftElementCount = index - iStart;
32        root.left = solve(inorder, preorder, iStart, index - 1, pStart + 1, pStart + 1 + leftElementCount -1);
33        //pstart +1 means = removing the root from preorder array boundary
34        root.right = solve(inorder, preorder, index +1 , iEnd, pStart + 1 + leftElementCount, pEnd );
35        //rest is same as postorder question
36        return root;
37    }
38}