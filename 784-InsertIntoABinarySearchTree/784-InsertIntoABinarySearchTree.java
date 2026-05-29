// Last updated: 30/05/2026, 00:04:36
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            root =  new TreeNode(val);
            return root;
        }
        helper(root, val);
        return root;
    }
    void helper(TreeNode root, int val){
        if (root.val > val) {
            if (root.left == null) {
                TreeNode temp = new TreeNode(val);
                root.left = temp;
                return;
            }
            insertIntoBST(root.left, val);
        } else {
            if (root.right == null) {
                TreeNode temp = new TreeNode(val);
                root.right = temp;
                return;
            }
            insertIntoBST(root.right, val);
        }
    }
}