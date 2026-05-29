// Last updated: 30/05/2026, 00:05:24
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
    public boolean isPalindrome(ListNode head) {
        ListNode curr= head;
        ListNode prev= null;
        
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            //finding middle logic
            fast=fast.next.next;
            //reversing till middle logic
            ListNode temp = curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        if(fast!=null) curr=curr.next;
        while(prev!=null && curr!=null){
            if(prev.val!=curr.val) return false;
            prev=prev.next;
            curr=curr.next;
        }
        return true;
    }
}