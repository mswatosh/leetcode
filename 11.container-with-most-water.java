/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    //Brute force method, times out on longest test cases
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i+1; j < height.length; j++) {
                int min = (height[i] < height[j]) ? height[i] : height[j];
                int area = min * (j-i);
                if (area > max) max = area;
            }
        }
        return max;
    }
}
// @lc code=end

