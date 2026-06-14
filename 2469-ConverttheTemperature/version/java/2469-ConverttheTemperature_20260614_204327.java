// Last updated: 14/06/2026, 20:43:27
1class Solution {
2    public double[] convertTemperature(double celsius) {
3        return new double[] {
4            celsius + 273.15,
5            celsius * 1.80 + 32.00
6
7        };
8    }
9}