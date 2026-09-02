// Last updated: 02/09/2026, 23:47:04
// O(1) space complexity
1class Solution {
2    public void solve(char[][] board) {
3        int m = board.length;
4        int n = board[0].length;
5        for(int i = 0; i < m; i++){
6            for(int j = 0; j< n; j++){
7                if(i == 0 || i == m-1 || j == 0 || j == n-1){ //borders
8                    if(board[i][j] == 'O')
9                        markRegion(i,j, board);
10                }
11            }
12        }
13        for(int i = 0; i < m; i++){
14            for(int j = 0; j< n; j++){
15                if(board[i][j] == 'Y')
16                    board[i][j] = 'O';
17                else 
18                    board[i][j] = 'X';
19            }
20        }
21    }
22
23    void markRegion(int i, int j, char[][] board) {
24        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1 || board[i][j] == 'X'|| board[i][j] == 'Y')
25            return;
26        board[i][j] = 'Y';
27        // Directions array: Down, Up, Right, Left
28        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
29        for (int[] dir : dirs) {
30            int r = i + dir[0];
31            int c = j + dir[1];
32            markRegion(r, c, board);
33        }
34    }
35}