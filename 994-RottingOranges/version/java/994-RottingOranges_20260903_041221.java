// Last updated: 03/09/2026, 04:12:21
/*
 * BFS: Similar to 0-1 matrix
 * 1. all zeroes matrix edge case
*/

1class Solution {
2    public int orangesRotting(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5        boolean onlyZeroes = true;
6        int minute = 0;
7        Queue<int[]> q = new LinkedList<>();
8        for(int i = 0; i<m; i++){
9            for(int j = 0; j<n; j++){
10                if(grid[i][j] == 2){
11                    q.add(new int[]{i,j});
12                    onlyZeroes = false;
13                }
14                else if(grid[i][j] == 1){
15                    onlyZeroes = false;
16                }
17            }
18        }
19        if(onlyZeroes) return 0;
20        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
21        while(!q.isEmpty()){
22            int size = q.size();
23            while(size>0 && !q.isEmpty()){
24                int[] top = q.poll();
25                for (int[] dir : dirs) {
26                    int r = top[0] + dir[0];
27                    int c = top[1] + dir[1];
28                    if (r >= 0 && r < m && c >= 0 && c < n) {
29                        if (grid[r][c] == 1) {
30                            q.add(new int[] { r, c });
31                            grid[r][c] = 2;
32                        }
33                    }
34                }
35                size--;
36            }
37            minute++;
38        }
39        for(int i = 0; i<m; i++){
40            for(int j = 0; j<n; j++){
41                if(grid[i][j] == 1)
42                    return -1;
43            }
44        }
45        return minute-1;
46    }
47}