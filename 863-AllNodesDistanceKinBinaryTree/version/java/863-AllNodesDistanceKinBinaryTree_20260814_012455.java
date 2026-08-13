// Last updated: 14/08/2026, 01:24:55
/*
 * Cleaner Code
 * 1. Clean up storeParent by passing the parent directly
 * 2. Store TreeNode objects in visited, not Integer (avoids primitive autoboxing (converting int to Integer behind the scenes), which saves a tiny amount of memory and time +  handle trees that might have duplicate values in the future.)
*/

1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    List<Integer> ans;
12    Map<TreeNode, TreeNode> parent;
13
14    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
15        ans = new ArrayList<>();
16        parent = new HashMap<>();
17        Set<TreeNode> visited = new HashSet<>();
18        storeParent(root, null);
19        findNodes(target, k, visited);
20        return ans;
21    }
22
23    void findNodes(TreeNode curr, int k, Set<TreeNode> visited) {
24        if (curr == null || visited.contains(curr))
25            return;
26        visited.add(curr);
27        if (k == 0) {
28            ans.add(curr.val);
29            return;
30        }
31        findNodes(curr.left, k - 1, visited);
32        findNodes(curr.right, k - 1, visited);
33        findNodes(parent.get(curr), k - 1, visited);
34    }
35
36    void storeParent(TreeNode root, TreeNode parentNode) {
37        if (root == null)
38            return;
39        parent.put(root, parentNode);
40        storeParent(root.left, root);
41        storeParent(root.right, root);
42    }
43}