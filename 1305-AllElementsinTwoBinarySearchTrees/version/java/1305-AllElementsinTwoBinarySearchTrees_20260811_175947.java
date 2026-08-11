// Last updated: 11/08/2026, 17:59:47
/*
 * In order witout Recursion: 2 stacks approach (merge two BSTs)
 * Caveats:
 * 1. Intuition of using two stacks while simultaneously popping from one of them based on whose top is smaller.
 * 2. Checking for stack one or stack two being empty inside the loop to ensure if one finishes, the second one continues the loop.
 * 3. While condition to make sure the loop keeps running if either of the stacks has one remaining element.
 * 4. Traversing a non-empty stack at the end won't cut it because it will not go to the right and traverse the root.
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
19		if (r1 == null && r2 == null)
20			return list;
21		Deque<TreeNode> st1 = new ArrayDeque<>();
22		Deque<TreeNode> st2 = new ArrayDeque<>();
23		TreeNode curr1 = r1;
24		TreeNode curr2 = r2;
25		while ((!st1.isEmpty() || !st2.isEmpty()) || (curr1 != null || curr2 != null)) {
26			while (curr1 != null) {
27				st1.push(curr1);
28				curr1 = curr1.left;
29			}
30			while (curr2 != null) {
31				st2.push(curr2);
32				curr2 = curr2.left;
33			}
34			TreeNode top;
35			if(st1.isEmpty()){
36			    TreeNode t = st2.pop();
37			    curr2 = t.right;
38			    list.add(t.val);
39			    continue;
40			}
41			if(st2.isEmpty()){
42			    TreeNode t = st1.pop();
43			    curr1 = t.right;
44			    list.add(t.val);
45			    continue;
46			}
47			if (st1.peek().val<st2.peek().val)
48				{
49				top = st1.pop();
50				curr1 = top.right;
51			}
52			else {
53				top = st2.pop();
54				curr2 = top.right;
55			}
56			list.add(top.val);
57		}
58		return list;
59    }
60}