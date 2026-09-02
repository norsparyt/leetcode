// Last updated: 02/09/2026, 21:26:58
// Cleaner Code
1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3        int m = mat.length;
4        int n = mat[0].length;
5        int[][] dist = new int[m][n];
6        Queue<int[]> q = new LinkedList<>();
7        //initialise dist matrix and queue with 0 positions
8        for (int i = 0; i < m; i++) {
9            for (int j = 0; j < n; j++) {
10                if (mat[i][j] == 0) {
11                    q.add(new int[] { i, j });
12                    dist[i][j] = 0;
13                } else {
14                    dist[i][j] = Integer.MAX_VALUE;
15                }
16            }
17        }
18        // Directions array: Down, Up, Right, Left
19        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
20
21        while (!q.isEmpty()) {
22            int[] element = q.poll();
23            int i = element[0];
24            int j = element[1];
25            int d = dist[i][j];
26            for (int[] dir : dirs) {
27                int r = i + dir[0];
28                int c = j + dir[1];
29                if (r >= 0 && r < m && c >= 0 && c < n) {
30                    if (dist[r][c] > d + 1) {
31                        q.add(new int[] { r, c });
32                        dist[r][c] = d + 1;
33                    }
34                }
35            }
36        }
37        return dist;
38    }
39}