// Last updated: 08/07/2026, 17:39:33
/*
 * Sliding window: O(n) and O(n) tc and sc
 * 1. Storing the count of all characters either in a hash map or in an array, needed only for the second string.
 * 2. The use of a matched or count variable to count the number of valid characters in the current window, and only start the loop from the left when we hit a valid window with all required characters from the second string.
 * 3. The intuition of first going on the outside only looking to the right while we keep on incrementing the count of characters, and only starting from the left when we hit a correct window.
 * All in all, a difficult question. Retry.
*/

1class Solution {
2    public String minWindow(String s, String p) {
3        int len1 = s.length();
4        int len2 = p.length();
5
6        if (len1 < len2)
7            return "";
8
9        int[] countP = new int[256];
10        int[] countS = new int[256];
11
12        for (int i = 0; i < len2; i++)
13            countP[p.charAt(i)]++;
14
15        int start = 0, start_idx = -1, min_len = Integer.MAX_VALUE;
16        int count = 0;
17
18        for (int j = 0; j < len1; j++) {
19            char currChar = s.charAt(j);
20            countS[currChar]++;
21            // If not a garbage character and if not count of valid char in excess of 2nd string, increment count
22            if (countP[currChar] > 0 && countS[currChar] <= countP[currChar]) {
23                count++;
24            }
25            // If all characters are matched, we have a valid window
26            if (count == len2) {   
27                // now try to minimize the window from left side : start
28                char startChar;
29                while (countS[startChar = s.charAt(start)] > countP[startChar] || countP[startChar] == 0) {
30                    //if a garbage char or if count of char in excess: start++
31                    if (countS[startChar] > countP[startChar]) {
32                        countS[startChar]--;
33                    }
34                    start++;
35                }
36                // Update window size
37                int len = j - start + 1;
38                if (min_len > len) {
39                    min_len = len;
40                    start_idx = start;
41                }
42            }
43        }
44
45        if (start_idx == -1)
46            return "";
47        return s.substring(start_idx, start_idx + min_len);
48    }
49}