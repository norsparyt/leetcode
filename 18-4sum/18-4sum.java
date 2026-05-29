// Last updated: 30/05/2026, 00:07:12
class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int l, r;
        long c_sum = 0;
        for (int k = 0; k < arr.length - 3; k++) {
            if (k != 0 && arr[k] == arr[k - 1])
                    continue;
            for (int i = k+1; i < arr.length - 2; i++) {
                if (i != k+1 && arr[i] == arr[i - 1])
                    continue;
                l = i + 1;
                r = arr.length - 1;
                while (l < r) {
                    c_sum=(long)arr[k]+arr[i]+arr[l]+arr[r];                   
                    if (c_sum == target) {
                        ans.add(Arrays.asList(arr[k],arr[i],arr[l],arr[r]));
                        r--;l++;
                        while (l < r && arr[l] == arr[l - 1]) l++;
                        while (l < r && arr[r] == arr[r + 1]) r--;
                        continue;
                    }
                    else if (c_sum > target)
                        r--;
                    else
                        l++;
                }
            }
        }
        return ans;
    }
}