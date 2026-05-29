// Last updated: 30/05/2026, 00:05:21
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<TreeNode> list;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        list = new ArrayList<>();
        hasPath(root, p.val);
        List<TreeNode> list2 = new ArrayList<>(list);
        list = new ArrayList<>(); // IMPORTANT
        hasPath(root, q.val);
        int size = Math.min(list.size(), list2.size());

        TreeNode ans = root;

        for (int i = 1; i < size; i++) {
            if (list.get(i).val == list2.get(i).val) {
                ans = list.get(i);
            } else break;
        }
        return ans;
    }

    boolean hasPath(TreeNode root, int val) {
        if (root == null)
            return false;
        list.add(root);

        if (root.val == val)
            return true;

        if (!hasPath(root.left, val) && !hasPath(root.right, val)) {
            list.remove(list.size() - 1);
            return false;
        }
        return true;
    }
}