// Last updated: 24/11/2026, 00:21:52
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        List<List<String>> ans = new ArrayList<>();
4        Map<String, List<String>> map = new HashMap<>();
5        for(int i = 0; i<strs.length;i++){
6            int[] count = new int[26];
7            for(int j = 0; j < strs[i].length(); j++){
8                count[(int)strs[i].charAt(j)-'a']++;
9            } // tc reduced from nklogk to nk
10            String uniqueKey = Arrays.toString(count); //using array as unique key to reduce tc
11            map.computeIfAbsent(uniqueKey, k -> new ArrayList<>()).add(strs[i]);
12        }
13        for (List<String> list : map.values()) {
14            ans.add(list);
15        }
16        return ans;
17    }
18}