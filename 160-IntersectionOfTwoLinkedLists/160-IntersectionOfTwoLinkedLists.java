// Last updated: 30/05/2026, 00:05:54
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = findSize(headA);
        int sizeB = findSize(headB);
        int diff=0;
        ListNode fast;
        ListNode slow;
        if(sizeA>sizeB) {
            diff= sizeA-sizeB;    
            fast=trav(headA, diff);
            slow=headB;
            }
        else {
            diff= sizeB-sizeA;
            fast=trav(headB, diff);
            slow=headA;
            }
        while(fast!=null && slow!=null){
            if(fast==slow) return fast;
            fast=fast.next;
            slow=slow.next;
        }
        return null;
    }
    ListNode trav( ListNode head, int diff){
        ListNode curr=head;
        while(diff>0){
            curr=curr.next;
            diff--;
        }
        return curr; 
    }
    int findSize(ListNode head) {
        ListNode curr = head;
        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        return size;
    }
}