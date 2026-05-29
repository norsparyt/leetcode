// Last updated: 30/05/2026, 00:05:51
class Solution {
    public String convertToTitle(int columnNumber) {
        String str="";
        while(columnNumber>0){
            columnNumber--;
            int rem = columnNumber % 26;
            str=(char)((rem)+65)+str;
            columnNumber/=26;
        }
        return str;
    }
}