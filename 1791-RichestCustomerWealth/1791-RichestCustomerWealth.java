// Last updated: 30/05/2026, 00:03:55
class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth=0;
        int max=0;
        for(int i=0;i<accounts.length;i++){
            wealth=0;
            for(int j=0;j<accounts[0].length;j++){
                wealth+=accounts[i][j];
            }
            max=Math.max(max,wealth);
        }
        return max;
    }
}