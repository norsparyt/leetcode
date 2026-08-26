// Last updated: 26/08/2026, 05:53:01
// O(nˆ2) traversal of adj matrix
1class Solution {
2    public int[] findDegrees(int[][] matrix) {
3        int[] count=new int[matrix.length];
4        int i = 0;
5        for(int[] row: matrix){
6            for(int col: row){
7                if(col == 1)
8                    count[i]++;
9            }
10            i++;
11        }
12        return count;
13    }
14}