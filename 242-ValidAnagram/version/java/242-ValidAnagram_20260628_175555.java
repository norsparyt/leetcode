// Last updated: 28/06/2026, 17:55:55
/*
 * HashMap Soln.
 * Caveat:
 * s and t size should also be the same.
*/

1class Solution {
2    public boolean isAnagram(String str1, String str2) {
3        if(str1.length()!=str2.length()) 
4            return false;
5        Map<Character, Integer> map = new HashMap<>();
6        for (int i = 0; i < str1.length(); i++) {
7            int count = map.getOrDefault(str1.charAt(i),0);
8            if (count == 0)
9                map.put(str1.charAt(i), 1);
10            else
11                map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
12        }
13        for (int i = 0; i < str2.length(); i++) {
14            char ch = str2.charAt(i);
15            int count = map.getOrDefault(ch,0);
16            if (count == 0)
17                return false;
18            else
19                map.put(ch, count - 1);
20        }
21        return true;
22    }
23}