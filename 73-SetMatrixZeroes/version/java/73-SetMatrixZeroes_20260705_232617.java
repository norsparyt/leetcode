// Last updated: 05/07/2026, 23:26:17
// Not in place: hashset
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5        Set<Integer> row = new HashSet<>();
6        Set<Integer> col = new HashSet<>();
7        for(int i = 0; i < m; i++){
8            for(int j = 0; j < n; j++){
9                if(matrix[i][j] == 0){
10                    row.add(i);
11                    col.add(j);
12                }
13            }
14        }
15        for(int r: row){
16            for( int i = 0; i < n; i++)
17                matrix[r][i] = 0;
18        }
19        for(int c: col){
20            for( int j = 0; j < m; j++)
21                matrix[j][c] = 0;
22        }
23    }
24}