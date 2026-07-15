// Last updated: 15/07/2026, 20:07:11
/*
 * Cleaned Up: O(n+m) tc and O(1) time
 * Caveats:
 * 1. No need of new nodes everytime, just rewrite path
 * 2. use dummy node trick to return head.next
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode one = list1;
14        ListNode two = list2;
15        ListNode curr = new ListNode(-1);
16        ListNode head = curr;
17        while (one != null && two != null) {
18            if (one.val <= two.val) {
19                curr.next = one;
20                one = one.next;
21            } else {
22                curr.next = two;
23                two = two.next;
24            }
25            curr = curr.next;
26        }
27        while (one != null) {
28            curr.next = one;
29            curr = curr.next;
30            one = one.next;
31        }
32        while (two != null) {
33            curr.next = two;
34            curr = curr.next;
35            two = two.next;
36        }
37        return head.next;
38    }
39}