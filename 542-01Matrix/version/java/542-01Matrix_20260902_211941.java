// Last updated: 02/09/2026, 21:19:41
/*
 * BFS Ripple effect search : O(m*n) tc
 * 1. dfs wont work going in only one direction
 * 2. We process levels 0, 1, 2  one by one and so on. 
 * 3. Keep in mind the initialization of the array.
*/

1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3        int m = mat.length;
4        int n = mat[0].length;
5        int[][] dist = new int[m][n];
6        Queue<int[]> q = new LinkedList<>();
7        //initialise dist matrix and queue with 0 positions
8        for(int i = 0; i <m ; i++){
9            for(int j = 0; j<n; j++){
10                if(mat[i][j] == 0){
11                    q.add(new int[]{i,j,0});
12                    dist[i][j] = 0;
13                }
14                else{
15                    dist[i][j] = Integer.MAX_VALUE;
16                }
17            }
18        }
19        while(!q.isEmpty()){
20            int[] element = q.remove();
21            int i = element[0];
22            int j = element[1];
23            int d = element[2];
24            //down
25            if(i+1>=0 && i+1<m && j>=0 && j<n){
26                if(dist[i+1][j] > d+1){
27                    q.add(new int[]{i+1,j,d+1});
28                    dist[i+1][j] = d+1;
29                }
30            }
31            //left
32            if(i>=0 && i<m && j-1>=0 && j-1<n){
33                if(dist[i][j-1] > d+1){
34                    q.add(new int[]{i,j-1,d+1});
35                    dist[i][j-1] = d+1;
36                }
37            }
38            //up
39            if(i-1>=0 && i-1<m && j>=0 && j<n){
40                if(dist[i-1][j] > d+1){
41                    q.add(new int[]{i-1,j,d+1});
42                    dist[i-1][j] = d+1;
43                }
44            }
45            //right
46            if(i>=0 && i<m && j+1>=0 && j+1<n){
47                if(dist[i][j+1] > d+1){
48                    q.add(new int[]{i,j+1,d+1});
49                    dist[i][j+1] = d+1;
50                }
51            }
52        }
53        return dist;
54    }
55}