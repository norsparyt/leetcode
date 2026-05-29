// Last updated: 30/05/2026, 00:06:21
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    boolean helper(TreeNode root, long l, long h){
        if(root == null) 
            return true;
        long val=root.val;
        if(val<=l || val>=h) 
            return false;
        return helper(root.left, l, val) && helper(root.right, val, h);
    }
}