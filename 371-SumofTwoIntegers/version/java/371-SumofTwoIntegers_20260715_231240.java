// Last updated: 15/07/2026, 23:12:40
/*
 * Bitwise Approach
 * Caveats:
 * 1. thinking of solving bit by bit since +- cant be used
 * 2. using sum and carry as two operations using operator xor and and.
 * 3. running loop till carry is finished (assigning a and b)
 * Clicky one to know. Remember it.
*/

1class Solution {
2    public int getSum(int a, int b) {
3        while(a!=0){
4            int baseSum = a^b;
5            int carry = (a&b)<<1;
6            a = carry;
7            b = baseSum;
8        }
9        return b;
10    }
11}