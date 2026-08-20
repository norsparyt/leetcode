// Last updated: 21/08/2026, 01:02:32
// MinHeap Optimised: O(n log k) TC and O(k) SC
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
12    public ListNode mergeKLists(ListNode[] lists) {
13        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b)->(a.val - b.val));
14        for(ListNode node : lists){
15            if(node!=null)
16                minHeap.add(node);
17        }
18        ListNode head = new ListNode(-1);
19        ListNode curr = head;
20        while(!minHeap.isEmpty()){
21            ListNode min = minHeap.poll();
22            if(min.next!=null)
23                minHeap.add(min.next);
24            curr.next = min;
25            curr = curr.next;
26        }
27        curr.next = null; 
28        return head.next;
29    }
30}