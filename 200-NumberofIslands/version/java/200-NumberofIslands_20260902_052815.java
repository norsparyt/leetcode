// Last updated: 02/09/2026, 05:28:15
/*
 * DFS Approach:
 * 1. no need of visited array
 * 2. scan and come back after marking island as visited
*/

1class Solution {
2    int count;
3
4    public int numIslands(char[][] grid) {
5        count = 0;
6        for(int i = 0; i < grid.length;i++) {
7            for(int j = 0; j < grid[0].length;j++){
8                if(grid[i][j] == '1'){
9                    count++;
10                    markIsland(i, j, grid);
11                }
12            } 
13        }
14        return count;
15    }
16
17    void markIsland(int i, int j, char[][] grid){
18        if(i<0||i>=grid.length || j<0 || j>=grid[0].length) return;
19        if(grid[i][j] == '0'){
20            return;
21        }
22        else{
23            grid[i][j] = '0';
24            markIsland(i + 1, j, grid); // right
25            markIsland(i, j + 1, grid); // down
26            markIsland(i - 1, j, grid); // left
27            markIsland(i, j - 1, grid); // up
28        }
29    }
30}