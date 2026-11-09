class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;
        while (left < right) {
            int leftVal = heights[left];
            int rightVal = heights[right];
            int area = Math.min(leftVal, rightVal) * (right - left);
            maxArea = Math.max(area,maxArea);
            if (leftVal < rightVal) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}