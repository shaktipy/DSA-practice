/*
Problem: Remove Duplicates from Sorted List
Problem No: 83
Platform: LeetCode
Difficulty: Easy
Language: Java

Topics:
- Linked List

----------------------------------
Problem Statement:
----------------------------------
Given the head of a sorted linked list, delete all duplicates such that
each element appears only once. Return the linked list sorted as well.

----------------------------------
Approach / Explanation:
----------------------------------
Since the linked list is already sorted, duplicate elements will appear
next to each other.

1. Start from the head node.
2. Compare the current node with the next node.
3. If both values are equal, skip the next node.
4. Otherwise, move to the next node.
5. Continue until the end of the list.

----------------------------------
Time & Space Complexity:
----------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // duplicate found, skip next node
                current.next = current.next.next;
            } else {
                // move forward
                current = current.next;
            }
        }
        return head;
    }
}
