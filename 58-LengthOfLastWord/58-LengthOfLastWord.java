// Last updated: 30/05/2026, 00:06:43
class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int len = 0;

        // skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') i--;

        // count last word length
        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }

        return len;
    }
}