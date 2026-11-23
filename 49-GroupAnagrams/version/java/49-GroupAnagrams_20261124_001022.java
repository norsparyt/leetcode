// Last updated: 24/11/2026, 00:10:22
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        List<List<String>> ans = new ArrayList<>();
4        Map<String, List<String>> map = new HashMap<>();
5        for(int i =0; i<strs.length;i++){
6            char[] chars = strs[i].toCharArray(); //convert to array
7            Arrays.sort(chars); //sort arrray
8            String sorted = new String(chars); // get sorted string as key
9            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(strs[i]); //add to map of sorted key string
10        }
11        for (List<String> list : map.values()) {
12            ans.add(list);
13        }
14        return ans;
15    }
16}