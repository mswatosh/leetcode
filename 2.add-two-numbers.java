/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode number = new ListNode();
        ListNode currentNode = number;
        int plusOne = 0;
        while(true) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int val = (val1+val2+plusOne);
            if (val > 9) {
                plusOne = 1;
                val = val - 10;
            } else {
                plusOne = 0;
            }
            currentNode.val = val;

            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            
            if (l1 == null && l2 == null) {
                if (plusOne == 1) {
                    ListNode nextNode = new ListNode(1);
                    currentNode.next = nextNode;
                }
                return number;
            }
            
            ListNode nextNode = new ListNode();
            currentNode.next = nextNode;
            currentNode = nextNode;           
            
        }
    }
}
// @lc code=end

