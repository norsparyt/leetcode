// Last updated: 07/06/2026, 23:35:24
// Graph BFS: converted to adjacency matrix first
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        int V = isConnected.length;
4        boolean[] visited = new boolean[V];
5        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
6        for(int i=0;i< V; i++){
7            ArrayList<Integer> curr = new ArrayList<>();
8            for(int j=0;j< V; j++){
9                if(i!=j && isConnected[i][j]==1){
10                    curr.add(j);
11                }
12            }
13            adj.add(curr);
14        }
15        int count = 0;
16        for(int i=0;i< isConnected.length; i++){
17            if(!visited[i]){
18                bfs(i, visited, adj);
19                count++;
20            }
21        }
22        return count;
23    }
24    void bfs(int src, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
25        Queue<Integer> q = new LinkedList<>();
26        ArrayList<Integer> res = new ArrayList();
27        visited[src] = true;
28        q.add(src);
29        while(!q.isEmpty()){
30            int curr = q.peek();
31            q.poll();
32            res.add(curr);
33            for(int node: adj.get(curr)){
34                if(!visited[node]){
35                    visited[node] = true;
36                    q.add(node);
37                }
38            }
39        }
40    }
41}