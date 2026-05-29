// Last updated: 30/05/2026, 00:06:52
class Solution {
    public int trap(int[] height) {
        //     int n = height.length;
        // int count = 0;

        // while (true) {

        //     // Find first non-zero
        //     int first = -1;
        //     for (int i = 0; i < n; i++) {
        //         if (height[i] > 0) {
        //             first = i;
        //             break;
        //         }
        //     }

        //     // Find last non-zero
        //     int last = -1;
        //     for (int i = n - 1; i >= 0; i--) {
        //         if (height[i] > 0) {
        //             last = i;
        //             break;
        //         }
        //     }

        //     // If no boundary or only one bar remains → stop
        //     if (first == -1 || last == -1 || first >= last)
        //         break;

        //     // Process one horizontal layer
        //     for (int i = first; i <= last; i++) {
        //         if (height[i] == 0) {
        //             count++;              // water at this layer
        //         } else {
        //             height[i]--;          // lower the terrain by 1
        //         }
        //     }
        // }

        // return count; 
        //my naive logic works but tle on higher inputs
        int[] max_r=new int[height.length];
        int max=0;
        for(int i=max_r.length-1;i>=0;i--){
            if(height[i]>max) {
                max=height[i];
                }
            max_r[i]=max;
        }
        int wc=0;
        int max_so_far=0;
        for(int i=0;i<height.length-1;i++){
            if(height[i]>max_so_far) 
                max_so_far=height[i];
            wc=wc+Math.min(max_so_far,max_r[i])-height[i];
        }
        return wc;
    }
}