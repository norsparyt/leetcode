// Last updated: 09/06/2026, 02:38:47
/*
 * Hard so : Hard. 
 * Look at the only change: count pairs logic.
 * overflow to be kept in mind.
 * intuition: since we know condition i<j and we want somthing similar to nums[i]<nums[j] : merge is the only place we can check with.
*/

1class Solution {
2    static int count;
3
4    public int reversePairs(int[] nums) {
5        count = 0;
6        int n = nums.length;
7        mergeSort(nums, 0, n - 1);
8        return count;
9    }
10
11    static int[] merge(int[] first, int[] second) {
12        int n1 = first.length;
13        int n2 = second.length;
14        int[] arr = new int[first.length + second.length];
15
16        int i = 0, j = 0, k = 0;
17        while (i < n1 && j < n2) {
18            if (first[i] <= second[j])
19                arr[k++] = first[i++];
20            else
21                arr[k++] = second[j++];
22        }
23        while (i < n1)
24            arr[k++] = first[i++];
25        while (j < n2)
26            arr[k++] = second[j++];
27        return arr;
28    }
29
30    static int[] mergeSort(int arr[], int l, int r) {
31        if (l >= r)
32            return new int[] { arr[l] };
33        int m = l + (r - l) / 2;
34        int[] first = mergeSort(arr, l, m);
35        int[] sec = mergeSort(arr, m + 1, r);
36        countPairs(first, sec);
37        return merge(first, sec);
38    }
39
40    static void countPairs(int[] first, int[] second) {
41        //genius logic
42        int right_pointer = 0;
43        for (int left_pointer = 0; left_pointer < first.length; left_pointer++) {
44            while (right_pointer < second.length &&
45                    (long) first[left_pointer] > 2L * second[right_pointer]) {
46                right_pointer++;
47            }
48            count += right_pointer;
49        }
50    }
51}