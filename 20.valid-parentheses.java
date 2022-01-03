import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') stack.push(c);
            else {
                if (stack.size() == 0) return false;
                switch (stack.pop()) {
                     case '(' : if (c != ')') return false; break;
                     case '{' : if (c != '}') return false; break;
                     case '[' : if (c != ']') return false; break;
                }
            } 
        }
        if (stack.size() == 0) return true;
        return false;
    }
}
// @lc code=end

