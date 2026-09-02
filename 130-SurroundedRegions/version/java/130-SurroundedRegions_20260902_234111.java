// Last updated: 02/09/2026, 23:41:11
// DFS No of islands variation
1class Solution {
2    public void solve(char[][] board) {
3        int m = board.length;
4        int n = board[0].length;
5        boolean[][] vis = new boolean[m][n];
6        for(int i = 0; i < m; i++){
7            for(int j = 0; j< n; j++){
8                if(i == 0 || i == m-1 || j == 0 || j == n-1){ //borders
9                    if(board[i][j] == 'O')
10                        markRegion(i,j,vis, board);
11                }
12            }
13        }
14        for(int i = 0; i < m; i++){
15            for(int j = 0; j< n; j++){
16                if(!vis[i][j])
17                    board[i][j] = 'X';
18            }
19        }
20    }
21
22    void markRegion(int i, int j, boolean[][] vis, char[][] board) {
23        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1 || board[i][j] == 'X'|| vis[i][j])
24            return;
25        vis[i][j] = true;
26        // Directions array: Down, Up, Right, Left
27        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
28        for (int[] dir : dirs) {
29            int r = i + dir[0];
30            int c = j + dir[1];
31            markRegion(r, c, vis, board);
32        }
33    }
34}