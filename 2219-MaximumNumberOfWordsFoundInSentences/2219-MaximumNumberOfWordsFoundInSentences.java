// Last updated: 30/05/2026, 00:03:43
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (String s : sentences) {

            int count = 1;

            for (char c : s.toCharArray()) {

                if (c == ' ') {

                    count++;

                }

            }

            max = Math.max(max, count);

        }

        return max;
    }
}