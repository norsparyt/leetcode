// Last updated: 30/05/2026, 00:05:48
class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        
        for (int i = 0; i < columnTitle.length(); i++) {
            // Get the value of the current character (A=1, B=2...Z=26)
            int charValue = columnTitle.charAt(i) - 'A' + 1;
            
            // Shift the current result by one "place value" in base 26
            result = result * 26 + charValue;
        }
        
        return result;
    }
}