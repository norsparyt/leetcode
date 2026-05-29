// Last updated: 30/05/2026, 00:06:15
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length -1 );
    }
    TreeNode helper(int[] nums, int left, int right){
        if(left>right) 
            return null;
        int middle =  left+(right-left)/2;
        TreeNode curr = new TreeNode(nums[middle]);
        curr.left = helper(nums, left, middle -1);
        curr.right = helper(nums, middle + 1 , right);
        return curr;
    }
}