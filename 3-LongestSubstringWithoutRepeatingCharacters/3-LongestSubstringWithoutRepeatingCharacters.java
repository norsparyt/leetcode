// Last updated: 30/05/2026, 00:07:22
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0, end = 0;
        int max = 0;
        for (end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
                while (map.get(ch) > 1) {
                    char dup = s.charAt(start);
                    map.put(dup, map.get(dup) - 1);
                    start++;
                }
            } else
                map.put(ch, 1);
            max = Math.max(max, end - start + 1);
        }
        return max;
    }
}