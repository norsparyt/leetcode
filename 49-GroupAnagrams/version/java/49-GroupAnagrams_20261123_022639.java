// Last updated: 23/11/2026, 02:26:39
/*
 * hashmap soln
 * caveats: using a list inside a map ( dups need to be stored too)
*/

1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        List<List<String>> ans = new ArrayList<>();
4        Map<String, List<String>> map = new HashMap<>();
5        for(int i =0; i<strs.length;i++){
6            char[] chars = strs[i].toCharArray();
7            Arrays.sort(chars);
8            String sorted = new String(chars);
9            if(!map.containsKey(sorted)){
10                List<String> list = new ArrayList<>();
11                list.add(strs[i]);
12                map.put(sorted,list);
13            }
14            else
15                {
16                    List<String> list = map.get(sorted);
17                    list.add(strs[i]);
18                    map.put(sorted, list);
19                }
20        }
21        for (List<String> list : map.values()) {
22            ans.add(list);
23        }
24        return ans;
25    }
26}