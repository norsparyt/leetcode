// Last updated: 17/07/2026, 02:36:03
/*
 * Link list logic:
 * Caveats:
 * 1. Handling if there are several duplicates of the same value. For example, 7, 7, 7, 7: handling the remaining head in this case.
 * 2. Handling null values for curr's next and curr.
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
12    public ListNode removeElements(ListNode head, int val) {
13        if(head==null) return head;
14        ListNode curr = head;
15        while(curr!=null && curr.next!=null){
16            if(curr.next.val==val){
17                curr.next = curr.next.next;
18            }
19            else
20                curr = curr.next;
21        }
22        return (head.val==val)?head.next:head;
23    }
24}