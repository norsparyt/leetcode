// Last updated: 30/05/2026, 00:06:07
class Solution {
    static List<List<String>> ans;

    public List<List<String>> partition(String s) {
        ans = new ArrayList<List<String>>();
        findAll(s, new ArrayList<String>());
        return ans;
    }

    void findAll(String s, List<String> curr) {
        if (s.length() == 0) {
            ans.add(new ArrayList<String>(curr));
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            String remaining = s.substring(i);
            if (isPalindrome(prefix)) {
                curr.add(prefix);
                findAll(remaining, curr);
                curr.removeLast();
            }
        }

    }

    boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}