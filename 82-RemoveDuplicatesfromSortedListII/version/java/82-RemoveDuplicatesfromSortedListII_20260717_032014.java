// Last updated: 17/07/2026, 03:20:14
/*
 * LL Good Logic practise
 * Caveats:
 * 1. Creating a dummy node to handle dups situated at head.
 * 2. using two pointers to handle deletion
 * 3. process of inserting node at head to mindful of
*/

1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode deleteDuplicates(ListNode head) {
13        if (head == null)
14            return head;
15        ListNode temp = head;
16        head = new ListNode(-1);
17        head.next = temp;
18
19        ListNode prev = head;
20        ListNode curr = head.next;
21        while (curr != null && curr.next != null) {
22            if (curr.val == curr.next.val) {
23                while (curr != null && curr.next != null && curr.val == curr.next.val) {
24                    curr.next = curr.next.next;
25                }
26                prev.next = prev.next.next;
27                curr = prev.next;
28            } else {
29                prev = prev.next;
30                curr = curr.next;
31            }
32        }
33        return head.next;
34    }
35}