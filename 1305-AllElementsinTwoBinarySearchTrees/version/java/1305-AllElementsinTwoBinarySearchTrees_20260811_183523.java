// Last updated: 11/08/2026, 18:35:23
/*
 * Cleaner code.
 * Trick : short-circuit evaluation.
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
17    public List<Integer> getAllElements(TreeNode r1, TreeNode r2) {
18        List<Integer> list = new ArrayList<>();
19        Deque<TreeNode> st1 = new ArrayDeque<>();
20        Deque<TreeNode> st2 = new ArrayDeque<>();
21        TreeNode curr1 = r1;
22        TreeNode curr2 = r2;
23        while ((!st1.isEmpty() || !st2.isEmpty()) || (curr1 != null || curr2 != null)) {
24            while (curr1 != null) {
25                st1.push(curr1);
26                curr1 = curr1.left;
27            }
28            while (curr2 != null) {
29                st2.push(curr2);
30                curr2 = curr2.left;
31            }
32            TreeNode top;
33            if (st1.isEmpty() || (!st2.isEmpty() && st1.peek().val > st2.peek().val)) {
34                top = st2.pop();
35                curr2 = top.right;
36                list.add(top.val);
37            } else {
38                top = st1.pop();
39                curr1 = top.right;
40                list.add(top.val);
41            }
42        }
43        return list;
44    }
45}