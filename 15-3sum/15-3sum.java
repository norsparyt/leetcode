// Last updated: 30/05/2026, 00:07:15
class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int l, r;
        int c_sum = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if (i != 0 && arr[i] == arr[i - 1])
                continue;
            l = i + 1;
            r = arr.length - 1;
            while (l < r) {
                c_sum = arr[i] + arr[l] + arr[r];
                if (c_sum == 0) {
                    ans.add(Arrays.asList(arr[i], arr[l], arr[r]));
                    r--;
                    l++;
                    while (l < r && arr[l] == arr[l - 1])
                        l++;
                    while (l < r && arr[r] == arr[r + 1])
                        r--;
                    continue;
                }
                else if (c_sum > 0)
                    r--;
                else
                    l++;
            }
        }
        return ans;
    }
}