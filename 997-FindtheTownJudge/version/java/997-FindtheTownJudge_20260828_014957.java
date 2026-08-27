// Last updated: 28/08/2026, 01:49:57
/*
 * HashMap Soln
 * O(n + n) and O(n +n)
*/

1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        if(trust.length == 0) return (n==1)? 1: -1;
4        Map<Integer, Integer> map = new HashMap<>();
5        Set<Integer> people = new HashSet<>();
6        int max = -1;
7        int maxId = -1;
8        for(int i = 0; i< trust.length; i++){
9            map.put(trust[i][1], map.getOrDefault(trust[i][1], 0)+1);
10            if(max <  map.get(trust[i][1])){
11                max = map.get(trust[i][1]);
12                maxId = trust[i][1];
13            }
14            people.add(trust[i][1]);
15            people.add(trust[i][0]);
16        }
17        if(max!=(people.size()-1)) return -1;
18        for(int i = 0; i< trust.length; i++){
19            if(maxId == trust[i][0]) return -1;
20        }
21        return maxId;
22    }
23} 