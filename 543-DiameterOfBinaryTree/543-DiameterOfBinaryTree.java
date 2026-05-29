// Last updated: 30/05/2026, 00:04:55
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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter=0;
        length(root);
        return diameter;
     }
    int length(TreeNode root){
        if(root==null) return 0;
        
        int leftHeight= length(root.left);
        int rightHeight= length(root.right);
        diameter = Math.max(diameter, leftHeight+rightHeight);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
}