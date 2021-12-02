/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int length = 0;
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
                length++;
            } else if (map.get(s.charAt(i)) < i - length) {
                map.replace(s.charAt(i), i);
                length++;
            } else {
                if (length > maxLength) maxLength = length;
                length = i - map.get(s.charAt(i));
                map.replace(s.charAt(i), i);
            }
        }
                
        if (length > maxLength) maxLength = length;
        return maxLength;
    }
}
// @lc code=end

