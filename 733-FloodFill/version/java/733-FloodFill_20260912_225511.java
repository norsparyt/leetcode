// Last updated: 12/09/2026, 22:55:11
/*
 * Classic BFS graph with visited tracker 
 * (SImilar - rotting oranges)
*/

1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        int m = image.length;
4        int n = image[0].length;
5        boolean[][] vis = new boolean[m][n];
6        Queue<int[]> q = new LinkedList<>();
7        q.add(new int[]{sr,sc});
8        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
9        while(!q.isEmpty()){
10            int[] top = q.poll();
11            int original = image[top[0]][top[1]];
12            image[top[0]][top[1]] = color;
13            for (int[] dir : dirs) {
14                int r = top[0] + dir[0];
15                int c = top[1] + dir[1];
16                if (r >= 0 && r < m && c >= 0 && c < n && !vis[r][c]) {
17                    if (image[r][c] == original) {
18                        q.add(new int[] { r, c });
19                        vis[r][c] = true;
20                        }
21                    }
22                }
23            }
24            return image;
25        }
26    }