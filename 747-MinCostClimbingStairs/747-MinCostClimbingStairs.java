// Last updated: 30/05/2026, 00:04:42
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int takeOne = 0;
        int takeTwo = 0;
        for (int i = 2; i <= n; i++) {
            int temp = Math.min(takeOne + cost[i - 1], takeTwo + cost[i - 2]);
            takeTwo = takeOne;
            takeOne = temp;
        }
        return takeOne;
    }
}