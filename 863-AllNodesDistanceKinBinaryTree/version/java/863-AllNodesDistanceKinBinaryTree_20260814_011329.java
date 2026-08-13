// Last updated: 14/08/2026, 01:13:29
/*
 * HashMap: Modification of Binary Tree
 * Caveats:
 * 1. storing distances from root wont work because you dont know the path/direction of distances ( left and right are both -2 distance)
 * 2. the issue is : upward traversal. soln - store parent node of each node in hashmap
 * 3. 3 possible outcomes - starting from target node
 * 4. avoid infinite loop through going backwards using visited hashset.
 * Learning: function_call( ____, k--) ≠ funct( ____, k-1)
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
13    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
14        parent = new HashMap<>();
15        parent.put(root, null);
16        ans = new ArrayList<>();
17        storeParent(root);
18        // for (Map.Entry<TreeNode, TreeNode> entry : parent.entrySet()) {
19        //     System.out.println("Key: " + entry.getKey().val + ", Value: " + entry.getValue().val);
20        // }
21        Set<Integer> visited = new HashSet<>();
22        findNodes(target, k, visited);
23        return ans;
24    }
25    void findNodes(TreeNode curr, int k, Set<Integer> visited){
26        if(curr == null || visited.contains(curr.val)) return;
27        visited.add(curr.val);
28        if(k==0){
29            ans.add(curr.val);
30            return;
31        }
32        findNodes(curr.left, k-1,visited);
33        findNodes(curr.right, k-1,visited);
34        findNodes(parent.get(curr), k-1, visited);
35    }
36    void storeParent(TreeNode root) {
37        if(root == null) return;
38        if(root.left!=null){
39            parent.put(root.left, root);
40        }
41        if(root.right!=null){
42            parent.put(root.right, root);
43        }
44        storeParent(root.left);
45        storeParent(root.right);
46    }
47}