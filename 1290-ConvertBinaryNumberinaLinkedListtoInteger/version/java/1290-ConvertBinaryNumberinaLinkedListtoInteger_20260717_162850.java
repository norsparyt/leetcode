// Last updated: 17/07/2026, 16:28:50
/*
 * Bitwise Approach: 1 pass soln in O(n) time and O(1) space
 * Caveats:
 * Think left shift operator instead of calculating length first.
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
12    public int getDecimalValue(ListNode head) {
13        int ans = 0;
14        while(head!=null){
15            ans = (ans|head.val)<<1;
16            if(head.next==null) ans=ans>>1;
17            head = head.next;
18        }
19        return ans;
20    }
21}