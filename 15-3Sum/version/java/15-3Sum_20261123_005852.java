// Last updated: 23/11/2026, 00:58:52
1class Solution {
2    public List<List<Integer>> threeSum(int[] arr) {
3        Arrays.sort(arr);
4        List<List<Integer>> ans = new ArrayList<List<Integer>>();
5        int l, r;
6        int c_sum = 0;
7        for (int i = 0; i < arr.length - 2; i++) {
8            if (i != 0 && arr[i] == arr[i - 1])
9                continue;
10            if(arr[i]>0) 
11                break;
12            l = i + 1;
13            r = arr.length - 1;
14            while (l < r) {
15                c_sum = arr[i] + arr[l] + arr[r];
16                if (c_sum == 0) {
17                    ans.add(Arrays.asList(arr[i], arr[l], arr[r]));
18                    r--;
19                    l++;
20                    while (l < r && arr[l] == arr[l - 1])
21                        l++;
22                    while (l < r && arr[r] == arr[r + 1])
23                        r--;
24                }
25                else if (c_sum > 0)
26                    r--;
27                else
28                    l++;
29            }
30        }
31        return ans;
32    }
33}