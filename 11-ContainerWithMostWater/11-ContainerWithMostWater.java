// Last updated: 30/05/2026, 00:07:19
class Solution {
    public int maxArea(int[] height) {
        int left = 0,
                right = height.length - 1,
                area = 0;
        while (left < right) {
            area = Math.max(area, Math.min(height[left] , height[right]) * (right - left));
            if (height[left] < height[right]) 
                left++;
            else
                right--;
        }
        return area;
    }
}