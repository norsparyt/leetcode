// Last updated: 30/05/2026, 00:04:41
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int[] maxLeft = new int[arr.length];
        int[] minRight = new int[arr.length];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;  
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            maxLeft[i] = max;
            min = Math.min(min, arr[arr.length-1-i]);
            minRight[arr.length-1-i]= min;
        }
        int chunks = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (maxLeft[i] <= minRight[i+1])
                chunks++;
        }
        return chunks + 1;
    }
}