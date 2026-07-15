// Last updated: 15/07/2026, 20:01:36
// Variation of Array two pointer approach.
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        if (list1 != null && list2 == null)
14            return list1;
15        if (list1 == null && list2 != null)
16            return list2;
17        if (list1 == null && list2 == null)
18            return null;
19        ListNode one = list1;
20        ListNode two = list2;
21        ListNode curr = null;
22        ListNode head = null;
23        while (one != null && two != null) {
24            ListNode node;
25            if (one.val <= two.val) {
26                node = new ListNode(one.val);
27                one = one.next;
28            } else {
29                node = new ListNode(two.val);
30                two = two.next;
31            }
32            if(head == null){
33                curr = node;
34                head = curr;
35            }
36            else{
37                curr.next = node;
38                curr = curr.next;
39            }
40        }
41        while (one != null) {
42            curr.next = new ListNode(one.val);
43            curr = curr.next;
44            one = one.next;
45        }
46        while (two != null) {
47            curr.next = new ListNode(two.val);
48            curr = curr.next;
49            two = two.next;
50        }
51        return head;
52    }
53}