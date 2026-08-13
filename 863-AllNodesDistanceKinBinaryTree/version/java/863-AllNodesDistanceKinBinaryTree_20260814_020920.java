// Last updated: 14/08/2026, 02:09:20
// We always check if (currentDistance == k) at the very top of the while loop. At this exact moment, the previous level has been completely removed, and the next level hasn't been touched yet. The Queue is perfectly "pure"—it contains 100% of the nodes for the current distance, and nothing else.
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
15        // 1. Build the parent map just like before
16        parent = new HashMap<>();
17        storeParent(root, null);
18
19        List<Integer> ans = new ArrayList<>();
20        Queue<TreeNode> queue = new LinkedList<>();
21        Set<TreeNode> visited = new HashSet<>();
22
23        queue.offer(target);
24        visited.add(target);
25        int currentDistance = 0;
26
27        // 2. BFS Traversal
28        while (!queue.isEmpty()) {
29            // If we reached the k-th level, everything in the queue is our answer
30            if (currentDistance == k) {
31                for (TreeNode node : queue) {
32                    ans.add(node.val);
33                }
34                return ans;
35            }
36
37            // Lock the size to process only the current level
38            int levelSize = queue.size();
39            for (int i = 0; i < levelSize; i++) {
40                TreeNode curr = queue.poll();
41
42                // Check Left
43                if (curr.left != null && !visited.contains(curr.left)) {
44                    visited.add(curr.left);
45                    queue.offer(curr.left);
46                }
47                // Check Right
48                if (curr.right != null && !visited.contains(curr.right)) {
49                    visited.add(curr.right);
50                    queue.offer(curr.right);
51                }
52                // Check Parent
53                TreeNode parentNode = parent.get(curr);
54                if (parentNode != null && !visited.contains(parentNode)) {
55                    visited.add(parentNode);
56                    queue.offer(parentNode);
57                }
58            }
59            // Increment distance after finishing the entire level
60            currentDistance++;
61        }
62
63        return ans;
64    }
65
66    void storeParent(TreeNode root, TreeNode parentNode) {
67        if (root == null)
68            return;
69        parent.put(root, parentNode);
70        storeParent(root.left, root);
71        storeParent(root.right, root);
72    }
73}