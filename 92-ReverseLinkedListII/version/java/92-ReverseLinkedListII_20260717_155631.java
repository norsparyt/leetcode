// Last updated: 17/07/2026, 15:56:31
/*
 * Modification of Reverse :
 * Cavy Arts:
 * 1. Storing the previous and current pointers before and after reversing the length that is given.
 * 2. Reversing only the right minus left portion after traversing to that index.
 * 3. Initializing a dummy node to better handle previous for iteration.
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
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13        ListNode dummy = new ListNode(-1);
14        dummy.next = head;
15        ListNode prev= dummy;
16        ListNode curr= head;
17        for(int i = 1;i< left; i++){
18            curr = curr.next;
19            prev = prev.next;
20        }
21        ListNode start = prev;
22        ListNode end = curr;
23        int len = right - left;
24        ListNode temp;
25        while(curr!=null && len>=0){
26            temp = curr.next;
27            if(temp==null) head=curr;
28            curr.next=prev;
29            prev=curr;
30            curr=temp;
31            len--;
32        }
33        start.next = prev;
34        end.next = curr;
35        return dummy.next;
36    }
37}