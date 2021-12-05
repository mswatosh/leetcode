/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        String pal = s.substring(0, 1); //default to min palendrome of single character
        for (int i = 0; i < s.length()-pal.length(); i++) {
            int j = i; //position of additional matching characters
            while((j = s.indexOf(s.charAt(j),j+1)) != -1) {
                for (int k = i, l = j; k <= l; k++, l--) {
                    if (s.charAt(k+1) != s.charAt(l-1)) break;
                    //check if we're at the same or two adjacent characters
                    //meaning we've found a palindrome
                    if (k+1 == l-1 || k == l-1) {
                        if (s.substring(i, j+1).length() > pal.length()) {
                            pal = s.substring(i, j+1);
                        }
                    }
                }
            }
        }
        return pal;
    }
}
// @lc code=end

