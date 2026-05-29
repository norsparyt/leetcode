// Last updated: 30/05/2026, 00:06:24
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //O(n) space
    //     int count = 0;
    //     int arr[] = new int[m + n];
    //     int i = 0, j = 0;
    //     while (i < m && j < n) {
    //         if (nums1[i] <= nums2[j]) {
    //             arr[count++] = nums1[i];
    //             i++;
    //         } else {
    //             arr[count++] = nums2[j];
    //             j++;
    //         }
    //     }
    //     System.out.println("count" + count);
    //     while (i < m) {
    //         arr[count++] = nums1[i];
    //         i++;
    //     }
    //     while (j < n) {
    //         arr[count++] = nums2[j];
    //         j++;
    //     }
    //     for (int k = 0; k < arr.length; k++) {
    //         nums1[k] = arr[k];
    //     }
    // }
    
    //inplace
   
    m=m-1;
    n=n-1;
    while(m>=0 && n>=0){
        if(nums2[n]>nums1[m]){
            nums1[m+n+1]=nums2[n];
            n--;
        }
        else{
            nums1[m+n+1]=nums1[m];
            m--;
        }
    }
    while(n>=0){
        nums1[n]=nums2[n];
        n--;
    }
}
}