/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        boolean negative = x < 0 ? true : false;
        String max = Integer.toString(Integer.MAX_VALUE);
        StringBuffer s = new StringBuffer(Integer.toString(x));
        if (negative) s.deleteCharAt(0);
        s.reverse();
        if(s.length() == 10) { //Only check if we have 10 digits
            for (int i = 0; i < s.length(); i++) { 
                if (s.charAt(i) > max.charAt(i)) return 0;
                else if (s.charAt(i) < max.charAt(i)) return Integer.parseInt(s.toString()) * (negative ? -1 : 1);
            }
        }
        return Integer.parseInt(s.toString()) * (negative ? -1 : 1);
    }
}
// @lc code=end

