/*
Problem: Majority Element
Problem No: 169
Platform: LeetCode
Difficulty: Easy
Language: Java

Topics:
- Array
- Hash Table
- Divide and Conquer
- Sorting
- Counting

----------------------------------
Problem Statement:
----------------------------------
Given an array nums of size n, find the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.

It is guaranteed that the majority element always exists.

----------------------------------
Approach / Explanation:
----------------------------------
This solution uses the Boyer-Moore Voting Algorithm.

1. Maintain a count variable and a candidate element.
2. If count becomes zero, choose the current element as the candidate.
3. If the current element is the same as the candidate, increment count.
4. Otherwise, decrement count.
5. Since a majority element is guaranteed, the final candidate is the answer.

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
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;

        for (int num : nums) {
            if (count == 0) {
                element = num;
                count = 1;
            } else if (element == num) {
                count++;
            } else {
                count--;
            }
        }
        return element;
    }
}
