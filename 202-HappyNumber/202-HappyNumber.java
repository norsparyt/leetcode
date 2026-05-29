// Last updated: 30/05/2026, 00:05:39
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> uniqueItems = new HashSet<>();
        int sum = 0;
        while (sum != 1) {
            sum=0;
            while (n > 0) {
                sum = sum + (int)Math.pow(n % 10, 2);
                n = n / 10;
            }
            if(!uniqueItems.add(sum)){
                return false;
            }
            n = sum;
        }
        return true;
    }
}