// Last updated: 21/08/2026, 00:39:05
/*
 * Minheap Soln : easy - nO(n) tc and O(n) space complexity
 * Not optimal. Doesnt utilise arrays being sorted already.
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
12    public ListNode mergeKLists(ListNode[] lists) {
13        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b)->(a.val - b.val));
14        for(ListNode node : lists){
15            while(node != null){
16                minHeap.add(node);
17                node = node.next; 
18            }
19        }
20        if(minHeap.isEmpty()) return null;
21        ListNode head = minHeap.poll();
22        ListNode curr = head;
23        while(!minHeap.isEmpty()){
24            curr.next = minHeap.poll();
25            curr = curr.next;
26        }
27        curr.next = null; 
28        return head;
29    }
30}