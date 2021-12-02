/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int i = 0;
        int j = 0;
        double med = 0;
        if (length % 2 == 1) { //odd          
            while (i + j <= length/2) {
                if (i == nums1.length) {
                    med = nums2[j]; j++;
                } else if (j == nums2.length) {
                    med = nums1[i]; i++;
                } else {
                    if (nums1[i] < nums2[j]) {
                        med = nums1[i]; i++;
                    } else {
                        med = nums2[j]; j++;
                    }
                }
            }
        } else { //even
            int m1 = 0;
            int m2 = 0;
            while (i + j < length/2+1) {

                if (i == nums1.length) {
                    m2 = m1;
                    m1 = nums2[j]; j++;
                } else if (j == nums2.length) {
                    m2 = m1;
                    m1 = nums1[i]; i++;
                } else {
                    if (nums1[i] < nums2[j]) {
                        m2 = m1;
                        m1 = nums1[i]; i++;
                    } else {
                        m2 = m1;
                        m1 = nums2[j]; j++;
                    }
                }
            }
            med = (double) (m1+m2) /2;
        }

        return med;

    }

}
// @lc code=end

