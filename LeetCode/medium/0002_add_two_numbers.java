/*
Problem: Add Two Numbers
Platform: LeetCode
Difficulty: Medium
Problem No: 2

------------------------------------------------
Problem Statement:
------------------------------------------------
You are given two non-empty linked lists representing two non-negative
integers. The digits are stored in reverse order, and each node contains one
digit.

Add the two numbers and return the sum as a linked list. The result must also
store its digits in reverse order.

Example 1:
Input: l1 = [2, 4, 3], l2 = [5, 6, 4]
Output: [7, 0, 8]
Explanation: 342 + 465 = 807.

Example 2:
Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:
Input: l1 = [9, 9, 9, 9, 9, 9, 9], l2 = [9, 9, 9, 9]
Output: [8, 9, 9, 9, 0, 0, 0, 1]

Constraints:
- Each linked list contains at least one node.
- The digits are in the range 0 to 9.
- The numbers represented by the linked lists do not contain leading zeroes,
  except for the number 0 itself.

------------------------------------------------
Solution:
------------------------------------------------
*/

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
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        // Loop as long as there are nodes to process or a carry remaining
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Calculate new carry and the single digit value
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return dummyHead.next;
    }
}
