/*
 * @lc app=leetcode id=12 lang=java
 *
 * [12] Integer to Roman
 */

// @lc code=start
class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder("");
        //M - 1000s
        for (int i = 0; i < num / 1000; i ++) {
            sb = sb.append("M");
        }
        num = num % 1000; //remove 1000s digit
        //CM - D - CD -C - 100s
        int h = num / 100;
        switch (h) {
            case 9:
                sb.append("CM");
                break;
            case 4:
                sb.append("CD");
                break;
            default:
                if (h > 4) {
                    sb.append("D");
                    h -= 5;
                }
                for (int i = 0; i < h; i++) {
                    sb.append("C");
                }
                break;
        }
        num = num % 100; //remove 100s digit
        //XC - L - XL - X - 10s
        int t = num / 10;
        switch (t) {
            case 9:
                sb.append("XC");
                break;
            case 4:
                sb.append("XL");
                break;
            default:
                if (t > 4) {
                    sb.append("L");
                    t -= 5;
                }
                for (int i = 0; i < t; i++) {
                    sb.append("X");
                }
                break;
        }
        num = num % 10; //remove 10s digit
        //IX - V - IV - I
        switch (num) {
            case 9:
                sb.append("IX");
                break;
            case 4:
                sb.append("IV");
                break;
            default:
                if (num > 4) {
                    sb.append("V");
                    num -= 5;
                }
                for (int i = 0; i < num; i++) {
                    sb.append("I");
                }
                break;
        }
        return sb.toString();    
    }
}
// @lc code=end

