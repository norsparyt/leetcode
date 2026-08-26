// Last updated: 26/08/2026, 06:16:22
// Straightforward
1class Solution {
2    public int findCenter(int[][] edges) {
3        if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1])
4            return edges[0][0];
5        else return edges[0][1];
6    }
7}