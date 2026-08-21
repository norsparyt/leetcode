// Last updated: 21/08/2026, 19:36:26
1class Solution {
2    public int finalValueAfterOperations(String[] operations) {
3        int x = 0;
4
5        for (String operation : operations) {
6
7            if (operation.contains("+")) {
8
9                x++;
10
11            } else {
12
13                x--;
14
15            }
16
17        }
18
19        return x;
20    }
21}