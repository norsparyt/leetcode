// Last updated: 11/09/2026, 22:34:12
// math approach : O(n) and O(1)
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        long n = nums.length;
4        long expectedSum = n * (n + 1) / 2;
5        long expectedSqSum = n * (n + 1) * (2 * n + 1) / 6;
6    
7        long actualSum = 0, actualSqSum = 0;
8        for (int num : nums) {
9            actualSum += num;
10            actualSqSum += (long) num * num;
11        }
12        
13        // diff1 = missing - duplicate
14        long diff1 = expectedSum - actualSum; 
15        
16        // diff2 = missing^2 - duplicate^2
17        long diff2 = expectedSqSum - actualSqSum; 
18        
19        // sumBoth = missing + duplicate
20        long sumBoth = diff2 / diff1; 
21        
22        int missing = (int) ((diff1 + sumBoth) / 2);
23        int duplicate = (int) (sumBoth - missing);
24        
25        return new int[]{duplicate, missing};
26    }
27}