// Last updated: 30/05/2026, 00:05:16
class Solution {
    public int addDigits(int num) {
        //digital root
        return (1+(num-1)%9);
    }
}