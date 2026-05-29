// Last updated: 30/05/2026, 00:06:10
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
    int ans=0;
    public int maxPathSum(TreeNode root) {
        ans=root.val;
        sum(root);
        return ans;
     }
    int sum(TreeNode root){
        if(root==null) return 0;
        
        int leftSum= Math.max(sum(root.left),0);
        int rightSum = Math.max(sum(root.right),0);
        ans = Math.max(ans, root.val+ leftSum + rightSum);      
        return root.val + Math.max(leftSum, rightSum);
    }
}