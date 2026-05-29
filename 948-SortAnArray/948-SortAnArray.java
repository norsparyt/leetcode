// Last updated: 30/05/2026, 00:04:23
class Solution {
    public int[] sortArray(int[] arr) {

        //merge sort
        return mergeSort(arr, 0, arr.length - 1);

        //quick sort- doesnt work unless randomised
        // quickSort(arr, 0, arr.length - 1);
        // return arr;
    }

    static int[] mergeSort(int[] arr, int start, int end) {
        if (start == end) {
            int[] single = new int[] { arr[start] };
            return single;
        }
        int mid = (start + end) / 2;
        int[] first = mergeSort(arr, start, mid);
        int[] second = mergeSort(arr, mid + 1, end);
        return merge(arr, first, second);
    }

    static int[] merge(int[] arr, int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        int k = 0, i = 0, j = 0;
        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                merged[k++] = first[i++];
            } else {
                merged[k++] = second[j++];
            }
        }
        while (i < first.length)
            merged[k++] = first[i++];
        while (j < second.length)
            merged[k++] = second[j++];

        return merged;
    }

    int partition(int[] nums, int start, int end) {
        int i = start, j = start, pivot = nums[end];
        while (i <= end) {
            if (nums[i] <= pivot) {
                swap(nums, i, j);
                i++;
                j++;
            } else
                i++;
        }
        return j-1;
    }

    void quickSort(int[] arr, int start, int end) {
        if (start >= end)
            return;
        int pi = partition(arr, start, end);
        quickSort(arr, start, pi - 1);
        quickSort(arr, pi + 1, end);
    }

    void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}