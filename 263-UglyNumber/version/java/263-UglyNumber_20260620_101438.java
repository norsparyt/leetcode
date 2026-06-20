// Last updated: 20/06/2026, 10:14:38
// maths, every non prime factor can be broken down into prime factors, and if anything remainsn after continous division it must be prime
1class Solution {
2    public boolean isUgly(int n) {
3        if (n <= 0)
4            return false;
5        while (n % 2 == 0)
6            n = n / 2;
7        while (n % 3 == 0)
8            n = n / 3;
9        while (n % 5 == 0)
10            n = n / 5;
11        return n == 1;
12    }
13}