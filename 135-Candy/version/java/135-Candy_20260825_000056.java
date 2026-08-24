// Last updated: 25/08/2026, 00:00:56
/*
 * Greedy Peak and Valley Approach: O(N) time and O(1) space
 * 1. read comments for key subtraction line
 * 2. learn it i guess
*/

1class Solution {
2    public int candy(int[] ratings) {
3        int n =ratings.length;
4        int candies = n;
5        int i = 1;
6        while(i<n){
7            if(ratings[i-1] == ratings[i]){
8                // candies++;
9                i++;
10                continue;
11            }
12            //suppose we went up by 2 levels: peak gave +2 candies
13            int peak = 0;
14            while(i<n && ratings[i-1] < ratings[i]){
15                peak++;
16                candies+=peak;
17                i++;
18            }
19            //suppose we went down by 3 levels: peak gave +3 candies
20            int valley = 0;
21            while(i<n && ratings[i-1] > ratings[i]){
22                valley++;
23                candies+=valley;
24                i++;
25            }
26            // in total we needed peak to only have +3 candies ie.  Max of (left, right) =Max(peak,valley)
27            //so subtract the other value ie. Min(left, right) = Min (peak, valley);
28            candies-= Math.min(peak,valley);
29        }
30        return candies;
31    }
32}