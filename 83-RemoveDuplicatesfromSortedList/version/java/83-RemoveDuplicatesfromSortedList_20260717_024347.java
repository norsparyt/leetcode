// Last updated: 17/07/2026, 02:43:47
// Easy
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
13        if(head==null) return head;
14        ListNode curr = head;
15        while(curr!=null && curr.next!=null){
16            if(curr.val==curr.next.val){
17                curr.next = curr.next.next;
18            }
19            else
20                curr = curr.next;
21        }
22        return head;
23    }
24}