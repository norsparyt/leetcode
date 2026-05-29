// Last updated: 30/05/2026, 00:05:36
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr= head;
        ListNode temp= head;
        ListNode prev= null;
        while(curr!=null){
            temp = curr.next;
            if(temp==null) head=curr;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return head;
    }
}