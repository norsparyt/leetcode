// Last updated: 13/09/2026, 09:06:17
// Optimal DFS: O(1) space and O(m*n) time
1class Solution {
2    int[][] dirs;
3    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
4        dirs = new int[][]{ { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
5        int m = image.length;
6        int n = image[0].length;
7        int origColor = image[sr][sc];
8        if(origColor == color){
9            return image;
10        }
11        dfs(image, sr, sc, color, origColor);
12        return image;
13    }
14    void dfs(int[][] image, int i, int j, int newColor, int oldColor){
15        if (i < 0 || i >= image.length || j < 0 || j >= image[0].length || image[i][j] != oldColor)
16            return;
17        image[i][j] = newColor;
18        for (int[] dir : dirs) {
19            int r = i + dir[0];
20            int c = j + dir[1];
21            dfs(image, r, c, newColor, oldColor);
22        }
23    }
24}