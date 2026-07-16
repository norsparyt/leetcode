// Last updated: 16/07/2026, 21:06:00
/*
 * Binary search solution:
 * Caveats:
 * 1. Defining a search space of minimum and maximum value of k, that is, the minimum and maximum value present in the Piles array.
 * 2. Thinking of binary search as the solution, as there is a monotonic sorted search space where, when you increase the value of k, you will get a reduced value of number of hours.
 * 3. Minding the number of hours to be calculated from the function, as long as input h itself reaches 10^9, values of hours can easily go up to 10^9*10^4.
 * Note: code already handles length 1 perfectly, since min and max would be different always for length 1.
*/

1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        long min = 1, max = Integer.MIN_VALUE;
4        for(int i=0;i<piles.length;i++){
5            max =  Math.max(max,piles[i]);
6        }
7        long mid;
8        while(min<max){
9            mid = min+(max-min)/2;
10            long hrs = hours(piles,mid);
11            if(hrs<=h){
12                max = mid;
13            }
14            else
15                min = mid+1;
16        }
17        return (int)min;
18    }
19    long hours(int[] piles, long k){
20        long h = 0;
21        //since input h itself can reach 10ˆ9
22        for(int i=0;i<piles.length;i++){
23            h += (piles[i]/k);
24            if((piles[i]%k) >0) h++;
25        }
26        return h;
27    }
28}