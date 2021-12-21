/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        return x == reverseInt(x);
    }

    public int reverseInt(int x) {
        int y = 0;
        while (x != 0) {
            y = y*10+x%10;
            x = x/10;
        }
        return y;
    }
}
// @lc code=end

