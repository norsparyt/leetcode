// Last updated: 24/06/2026, 23:49:47
/*
 * binary search + 2 pointer soln o (k+log(n-k)) tc
 * gfg soln doesnt apply here since we require sorted answer
*/

1class Solution {
2    public List<Integer> findClosestElements(int[] arr, int k, int x) {
3        int left = 0;
4        int right = arr.length - k; 
5        
6        while (left < right) {
7            int mid = left + (right - left) / 2;
8            
9            // Compare the distance of 'x' from the start of the current window (arr[mid])
10            // to the element just outside the end of the window (arr[mid + k])
11            if (x - arr[mid] > arr[mid + k] - x) {
12                // The element at mid + k is closer to x than the element at mid.
13                // Therefore, the ideal window must start further to the right.
14                left = mid + 1;
15            } else {
16                // The element at mid is closer or equally close to x.
17                // The ideal window starts at mid or to the left of mid.
18                right = mid;
19            }
20        }
21        List<Integer> ans = new ArrayList<>();
22        for (int i = left; i < left + k; i++) {
23            ans.add(arr[i]);
24        }
25        return ans;
26    }
27}