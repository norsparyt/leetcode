// Last updated: 06/07/2026, 01:12:35
// In place solution.
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5        boolean row = false;
6        boolean col = false;
7
8        for (int i = 0; i < n; i++) {
9            if (matrix[0][i] == 0) {
10                row = true;
11                break;
12            }
13        }
14        for (int i = 0; i < m; i++) {
15            if (matrix[i][0] == 0) {
16                col = true;
17                break;
18            }
19        }
20        for (int i = 0; i < m; i++) {
21            for (int j = 0; j < n; j++) {
22                if (matrix[i][j] == 0) {
23                    //mark this row
24                    matrix[0][j] = 0;
25                    //mark this column
26                    matrix[i][0] = 0;
27                }
28            }
29        }
30        //for columns
31        for (int i = 1; i < n; i++) {
32            if (matrix[0][i] == 0) {
33                for (int j = 0; j < m; j++) {
34                    matrix[j][i] = 0;
35                }
36            }
37        }
38        //for rows
39        for (int i = 1; i < m; i++) {
40            if (matrix[i][0] == 0) {
41                for (int j = 0; j < n; j++) {
42                    matrix[i][j] = 0;
43                }
44            }
45        }
46        //handle 1st row and col to be zero
47        if (row) {
48            for (int i = 0; i < n; i++)
49                matrix[0][i] = 0;
50        }
51        if (col) {
52            for (int i = 0; i < m; i++)
53                matrix[i][0] = 0;
54        }
55    }
56}