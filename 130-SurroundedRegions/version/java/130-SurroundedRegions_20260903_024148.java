// Last updated: 03/09/2026, 02:41:48
/*
 * Most optimal: changes are as follows:
 * 1. Do not initialize the directions array in every function call, since it is a recursive one. Pass it as a parameter instead.
 * 2. Traverse only the boundaries, not the whole grid.
 * 3. The if condition for checking O elements is necessary, since even though the recursive call returns them, it gives overhead on the call stack.
*/

1class Solution {
2    public void solve(char[][] board) {
3        int m = board.length;
4        int n = board[0].length;
5        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
6        for (int i = 0; i < m; i++) {
7            if (board[i][0] == 'O')
8                markRegion(i, 0, board, dirs);
9            if (board[i][n - 1] == 'O')
10                markRegion(i, n - 1, board, dirs);
11        }
12        for (int j = 0; j < n; j++) {
13            if (board[0][j] == 'O')
14                markRegion(0, j, board, dirs);
15            if (board[m-1][j] == 'O')
16                markRegion(m - 1, j, board, dirs);
17        }
18        for (int i = 0; i < m; i++) {
19            for (int j = 0; j < n; j++) {
20                if (board[i][j] == 'Y')
21                    board[i][j] = 'O';
22                else
23                    board[i][j] = 'X';
24            }
25        }
26    }
27
28    void markRegion(int i, int j, char[][] board, int[][] dirs) {
29        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1 || board[i][j] == 'X'
30                || board[i][j] == 'Y')
31            return;
32        board[i][j] = 'Y';
33        // Directions array: Down, Up, Right, Left
34        for (int[] dir : dirs) {
35            int r = i + dir[0];
36            int c = j + dir[1];
37            markRegion(r, c, board, dirs);
38        }
39    }
40}