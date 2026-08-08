// Last updated: 09/08/2026, 01:56:30
/*
 * Prefix Sum: HashMap + Psum
 * Caveats: 
 * 1. thinking of ques as similar to subarray with sum k ques from arrays
 * 2. using simple dfs instead of complex recursion
 * 3. keeping count of psum instead of just a set
 * 3. putting inside map AFTER checking presence(to not double count)
 * 4. separate checking for both (psum= target ) for 0 target
 * 5. removing from map after use -backtracking (to keep only paths from up to down)
 * 6. decreasing count and not removing from map
 * 7. using long for pSum to avoid overflow
*/

1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int count;
18    Map<Long, Integer> map;
19
20    public int pathSum(TreeNode root, int targetSum) {
21        map = new HashMap<>();
22        count = 0;
23        if (root == null)
24            return 0;
25        sum(root, targetSum, root.val);
26        return count;
27    }
28
29    void sum(TreeNode root, int targetSum, long pSum) {
30        if (root == null)
31            return;
32        if (map.containsKey(pSum - targetSum)) {
33            count += map.get(pSum - targetSum);
34        }
35        if (pSum == targetSum)
36            count++;
37        map.put(pSum, 1 + map.getOrDefault(pSum, 0));
38        if (root.left != null)
39            sum(root.left, targetSum, pSum + root.left.val);
40        if (root.right != null)
41            sum(root.right, targetSum, pSum + root.right.val);
42        map.put(pSum,map.get(pSum)-1);
43    }
44}