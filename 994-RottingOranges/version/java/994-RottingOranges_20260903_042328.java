// Last updated: 03/09/2026, 04:23:28
/*
 * Cleaner Code:
 * 1. removed last loop check
*/

1class Solution {
2    public int orangesRotting(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int freshCount = 0;
6        int minute = 0;
7        Queue<int[]> q = new LinkedList<>();
8        for(int i = 0; i<m; i++){
9            for(int j = 0; j<n; j++){
10                if(grid[i][j] == 2){
11                    q.add(new int[]{i,j});
12                }
13                else if(grid[i][j] == 1){
14                    freshCount++;
15                }
16            }
17        }
18        if(freshCount == 0) return 0;
19        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
20        while(!q.isEmpty()){
21            int size = q.size();
22            while(size>0 && !q.isEmpty()){
23                int[] top = q.poll();
24                for (int[] dir : dirs) {
25                    int r = top[0] + dir[0];
26                    int c = top[1] + dir[1];
27                    if (r >= 0 && r < m && c >= 0 && c < n) {
28                        if (grid[r][c] == 1) {
29                            q.add(new int[] { r, c });
30                            grid[r][c] = 2;
31                            freshCount--;
32                        }
33                    }
34                }
35                size--;
36            }
37            minute++;
38        }
39        return freshCount == 0 ? minute-1 : -1;
40        //can use a boolean to only increment minute if rottedThisMinute remving need to return minute-1
41    }
42}