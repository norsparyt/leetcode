// Last updated: 30/05/2026, 00:04:09
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {

            int digits = String.valueOf(num).length();

            if (digits % 2 == 0) {

                count++;

            }

        }

        return count;
    }
}