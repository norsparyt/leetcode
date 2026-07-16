// Last updated: 17/07/2026, 03:28:37
/*
 * Cleaner Code: Improvements:
 * 1. no need of checking curr!=null
 * 2. create dummy and return dummy.next
 * 3. remove curr.next=curr.next.next (destructive approach)
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
13        ListNode dummy = new ListNode(-1);
14        dummy.next = head;
15
16        ListNode prev = dummy;
17        ListNode curr = head;
18        while (curr != null && curr.next != null) {
19            if (curr.val == curr.next.val) {
20                while (curr.next != null && curr.val == curr.next.val) {
21                    curr = curr.next;
22                }
23                prev.next = curr.next;
24            } else {
25                prev = prev.next;
26            }
27            curr = curr.next;
28        }
29        return dummy.next;
30    }
31}