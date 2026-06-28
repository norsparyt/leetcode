// Last updated: 28/06/2026, 22:42:18
/*
 * Hashset question : easy
 * Caveats:
 * mind logic for 4 loops for 3*3 box checking
*/

1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        //check rows
4        for (int i = 0; i < board.length; i++) {
5            Set<Character> set = new HashSet<>();
6            for (int j = 0; j < board[0].length; j++) {
7                if (board[i][j] == '.')
8                    continue;
9                if (set.contains(board[i][j]))
10                    return false;
11                else
12                    set.add(board[i][j]);
13            }
14        }
15        for (int j = 0; j < board[0].length; j++) {
16            Set<Character> set = new HashSet<>();
17            for (int i = 0; i < board.length; i++) {
18                if (board[i][j] == '.')
19                    continue;
20                if (set.contains(board[i][j]))
21                    return false;
22                else
23                    set.add(board[i][j]);
24            }
25        }
26
27        for (int x = 0; x <=6; x += 3) {
28            for (int y = 0; y <=6; y += 3) {
29                Set<Character> set = new HashSet<>();
30                for (int i = x; i < x + 3; i++) {
31                    for (int j = y; j < y + 3; j++) {
32                        if (board[i][j] == '.')
33                            continue;
34                        if (set.contains(board[i][j]))
35                            return false;
36                        else
37                            set.add(board[i][j]);
38                    }
39                }
40            }
41        }
42        return true;
43    }
44}