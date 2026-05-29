// Last updated: 30/05/2026, 00:07:13
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<String>();
        StringBuilder combination= new StringBuilder("");
        helper(0, combination, digits, ans);
        return ans;
    }

    void helper(int i, StringBuilder combination, String digits, List<String> ans) {
        if (combination.length() == digits.length()) {
            ans.add(combination.toString());
            return;
        }
        if (i >= digits.length())
            return;

        for (char ch = start(digits.charAt(i)); ch <= end(digits.charAt(i)); ch++) {
            combination.append(ch);
            helper(i + 1, combination, digits,ans);
            combination.deleteCharAt(combination.length()-1);
        }

    }

    static char start(char digit) {
        return switch (digit) {
            case '2' -> 'a';
            case '3' -> 'd';
            case '4' -> 'g';
            case '5' -> 'j';
            case '6' -> 'm';
            case '7' -> 'p';
            case '8' -> 't';
            case '9' -> 'w';
            default -> throw new IllegalArgumentException("Invalid digit: " + digit);
        };
    }

    static char end(int digit) {
        return switch (digit) {
            case '2' -> 'c';
            case '3' -> 'f';
            case '4' -> 'i';
            case '5' -> 'l';
            case '6' -> 'o';
            case '7' -> 's';
            case '8' -> 'v';
            case '9' -> 'z';
            default -> throw new IllegalArgumentException("Invalid digit: " + digit);
        };
    }
}