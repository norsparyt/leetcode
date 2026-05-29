// Last updated: 30/05/2026, 00:07:01
class Solution {
    public void nextPermutation(int[] nums) {
        // if (nums.length == 0 || nums.length == 1)
        //     return;
        // if (nums.length == 2) {
        //     int temp = nums[0];
        //     nums[0] = nums[1];
        //     nums[1] = temp;
        //     return;
        // }
        // int i;
        // //find first from left where it is smaller
        // for (i = nums.length - 2; i >= 0; i--) {
        //     if (nums[i] < nums[i + 1]) {
        //         break;
        //     }
        // }
        // //array is in descending order
        // if (i == -1) {
        //     Arrays.sort(nums);
        //     return;
        // }
        // int smallest = 101;
        // int smallest_index = -1;
        // for (int j = i; j < nums.length; j++) {
        //     if (nums[j] < smallest && nums[j] > nums[i]) {
        //         smallest = nums[j];
        //         smallest_index = j;
        //     }
        //     //find smallest after ith
        //     //which is greater than ith (next big to ith)
        // }
        // if (smallest_index != -1) {
        //     int temp = nums[i];
        //     nums[i] = nums[smallest_index];
        //     nums[smallest_index] = temp;
        //     //swap
        // }
        // Arrays.sort(nums, i + 1, nums.length);
        //tc = nlogn and sc= logn for sorting
        //instead just reverse(since after i array is already sort in desc)

        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j > i && nums[i] >= nums[j]) {
                j--;
            }
            //reverse breaks as soon as we found any bigger than ith
            //because its already in desc order
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        reverse(nums, i+1, nums.length - 1);
    }

    void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}