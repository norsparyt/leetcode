// Last updated: 26/08/2026, 07:29:43
// BFS + Adj list creation
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        if(source == destination) return true;
4        List<List<Integer>> adj = new ArrayList<>(); 
5        for(int i = 0; i < n; i++){
6            adj.add(new ArrayList<>());
7        }
8        for(int i = 0; i < edges.length; i++){
9            adj.get(edges[i][0]).add(edges[i][1]); 
10            adj.get(edges[i][1]).add(edges[i][0]); 
11        }
12        return bfs(adj, source, destination);
13    }
14    boolean bfs(List<List<Integer>> adj, int src, int dest){
15        Queue<Integer> q = new LinkedList<>();
16        boolean[] visited = new boolean[adj.size()];
17        q.add(src);
18        while(!q.isEmpty()){
19            int curr = q.poll();
20            for(int v: adj.get(curr)){
21                if(!visited[v]){    
22                    visited[v] = true;
23                    q.add(v);
24                }
25            }
26        }
27        return visited[dest];
28    }
29}