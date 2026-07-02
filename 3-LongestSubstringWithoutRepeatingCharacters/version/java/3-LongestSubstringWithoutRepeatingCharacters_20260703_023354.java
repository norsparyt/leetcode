// Last updated: 03/07/2026, 02:33:54
/*
 * HashMap Solution
 * -completely done on my own :)
*/

1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        Map<Character, Integer> map = new HashMap<>();
4        int length = 0;
5        int ans = 0;
6        int index = 0;
7        for (int i = 0; i < s.length(); i++) {
8            char ch = s.charAt(i);
9            if (map.containsKey(ch)) {
10                index = Math.max(index,map.get(ch));
11                ans = Math.max(ans, length);
12                length = i - index;
13                map.put(ch , i);
14            } else {
15                map.put(ch, i);
16                length++;
17            }
18        }
19        return Math.max(ans, length);
20    }
21}