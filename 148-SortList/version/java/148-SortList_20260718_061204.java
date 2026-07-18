// Last updated: 18/07/2026, 06:12:04
/*
 * MergeSort Solution:
 * Caveats:
 * 1. thinking of the possibility of using Merge Sort since we already have Merge to sort a list in a linked list.
 * 2. Doing `mid.next = null` so that two lists are severed and don't run endlessly in the loop.
 * 3. No need for an end pointer in the function call for Merge Sort because we are giving only the middle. The end is automatically reached by looping.
 * 4. Finding the middle needs to be on the left side of the middle for an even length linked list because it will return the same list again and again, causing a call stack overflow. For example, in a list of 4, 2, it keeps on returning the middle as 2, and the list never gets broken down into 4 and 2.
 * Note: The time complexity does not increase to O(n^2) and remains O(nlog n)) because the calls are separate and sequential: one for finding the middle and then call for merging the list.
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
12    public ListNode sortList(ListNode head) {
13        if(head==null) return head;
14        return mergeSort(head);
15    }
16    ListNode mergeSort(ListNode start){
17        if(start.next == null){
18            return start;
19        }
20        ListNode mid = middleNode(start);
21        ListNode midNext = mid.next;
22        mid.next = null;
23        ListNode left = mergeSort(start);
24        ListNode right = mergeSort(midNext);
25        return mergeTwoLists(left, right);
26    }
27    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
28        ListNode curr = new ListNode(-1);
29        ListNode head = curr;
30        //no need even of pointer nodes
31        while (list1 != null && list2 != null) {
32            if (list1.val <= list2.val) {
33                curr.next = list1;
34                list1 = list1.next;
35            } else {
36                curr.next = list2;
37                list2 = list2.next;
38            }
39            curr = curr.next;
40        }
41        // Simply attach the remainder of the other list directly.
42        if (list1 != null)
43            curr.next = list1;
44        if (list2 != null)
45            curr.next = list2;
46        return head.next;
47    }
48    public ListNode middleNode(ListNode head) {
49        ListNode temp = head;
50        ListNode temp2 = head.next;
51        while(temp2!=null && temp2.next!=null){
52            temp=temp.next;
53            temp2=temp2.next.next;
54        }
55        return temp;
56    }
57}