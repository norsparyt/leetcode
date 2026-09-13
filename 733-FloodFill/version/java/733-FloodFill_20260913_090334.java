// Last updated: 13/09/2026, 09:03:34
// DFS Approach : O(n) space
1class Solution {
2    int[][] dirs;
3    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
4        dirs = new int[][]{ { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
5        int m = image.length;
6        int n = image[0].length;
7        int[][] orig = new int[m][n];
8        dfs(orig, image, sr, sc, color, image[sr][sc]);
9        return image;
10    }
11    void dfs(int[][] orig, int[][] image, int i, int j, int newColor, int oldColor){
12        if (i < 0 || i >= image.length || j < 0 || j >= image[0].length || orig[i][j] == -1 || image[i][j] != oldColor)
13            return;
14        orig[i][j] = -1;
15        image[i][j] = newColor;
16        for (int[] dir : dirs) {
17            int r = i + dir[0];
18            int c = j + dir[1];
19            dfs(orig, image, r, c, newColor, oldColor);
20        }
21    }
22}