// Last updated: 30/05/2026, 00:04:02
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];
        for(int i = 0; i < s.length(); i++) {
            arr[indices[i]] = s.charAt(i);
        }
        return new String(arr);
    }
}