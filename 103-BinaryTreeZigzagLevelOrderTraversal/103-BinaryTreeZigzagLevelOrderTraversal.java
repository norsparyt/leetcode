// Last updated: 30/05/2026, 00:06:18
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level=1;
        while (!q.isEmpty()) {
            List<Integer> curr = new ArrayList<Integer>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                //reomve front
                TreeNode front = q.poll();
                //use front
                curr.add(front.val);
                //add front's children
                if (front.left != null)
                    q.add(front.left);
                if (front.right != null)
                    q.add(front.right);
            }
            if(level%2==0)
                Collections.reverse(curr); 
            ans.add(curr);
            level++;
        }
        return ans;
    }
}