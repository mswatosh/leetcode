/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] Zigzag Conversion
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s; //special case that breaks the rest of the logic

        StringBuilder ret = new StringBuilder();
        
        int row = 0;
        int interval = 2*numRows-2;
        while (s.length() != ret.length()) {
            int spot = row;
            int step = interval;
            ret.append(s.charAt(spot));
            while (spot + step < s.length()) {
                ret.append(s.charAt(spot + step));
                spot += step;
                step = 2*numRows-2-step;
                if (step == 0) step = 2*numRows-2;             
            }
            row++;
            interval-=2;
            if (interval == 0) interval = 2*numRows-2; //account for final row
        }

        return ret.toString();
    }
}
// @lc code=end

