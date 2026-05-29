// Last updated: 30/05/2026, 00:05:41
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
    List<Integer> ans;
    public List<Integer> rightSideView(TreeNode root) {
        ans = new ArrayList<Integer>();
        pre(root, 0);
        return ans;
    }
    void pre(TreeNode root, int level){
        if(root==null) 
            return;
        if(ans.size()==level)
            ans.add(root.val);
        pre(root.right, level+1);
        pre(root.left, level+1);
    }
}