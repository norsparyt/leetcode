// Last updated: 08/07/2026, 02:39:39
/*
 * Hashmap+ GCD
 * Caveats:
 * 1. intuition to use gcd to reduce the fraction ( not to divide by 0 and use messy fractions)
 * 2. storing a unique identifier of an object/string in hashmap for slope
 * 3. logic for slope of negative nos. ( using abs values since 0,1 and 1,0 are the same slopes stored twice because of different anchor points)
 * 4. resetting hashmap in every anchor loop.
 * O(nˆ2) solution is optimal
*/

1class Solution {
2    public int maxPoints(int[][] points) {
3        int m = points.length;
4        if (m <= 2) return m;
5        int max = 1;
6        for(int i = 0; i < m ;i++){
7            Map<String, Integer> map = new HashMap<>();
8            for(int j = 0; j< m; j++){
9                if(i==j) continue;
10                int x = points[j][0] - points[i][0];
11                int y = points[j][1] - points[i][1];
12                int gcd = generateGCD(Math.abs(x), Math.abs(y));
13                x/=gcd;
14                y/=gcd;
15                if(x<0){
16                    x=-x;
17                    y=-y;
18                }
19                else if(x==0){
20                    y= Math.abs(y); // to prevent 0,-1 and 0,1 as different stores
21                }
22                String slope = x + "," + y;
23                //due to negative signs: stored twice in hashmaps
24                map.put(slope, map.getOrDefault(slope,0)+1);
25                max = Math.max(max, map.get(slope));
26            }
27        }
28        return max+1;
29    }
30
31    //based on euclidian principal
32    // A standard, clean Euclidean GCD helper
33    private int generateGCD(int a, int b) {
34        if (b == 0) return a;
35        return generateGCD(b, a % b);
36    }
37}