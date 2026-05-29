// Last updated: 30/05/2026, 00:04:56
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] res = new int[mat.length][mat[0].length];
        Queue<int[]> q = new LinkedList<int[]>();

        //  INITIALISE AS -1 AND ADD TO QUEUE WHERE 0   
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                if (mat[i][j] == 0)
                    q.offer(new int[] { i, j });
                else
                    res[i][j] = -1;
            }
        }
        //DIRECTIONS
        int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            for (int[] direction : directions) {
                int nr = r + direction[0];
                int nc = c + direction[1];
                if (nr >= 0 && nr < mat.length && nc >= 0 && nc < mat[0].length && res[nr][nc] == -1) {
                    res[nr][nc] = res[r][c] + 1;
                    q.offer(new int[] { nr, nc });
                }
            }
        }
        return res;
    }
}