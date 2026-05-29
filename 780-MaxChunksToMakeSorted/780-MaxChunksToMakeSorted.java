// Last updated: 30/05/2026, 00:04:39
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int maxSoFar=arr[0];
        int chunks=0;
        for(int i=0;i<arr.length;i++){
            maxSoFar=Math.max(arr[i],maxSoFar);
            if(maxSoFar==i) chunks++;
        }
        return chunks;
    }
}