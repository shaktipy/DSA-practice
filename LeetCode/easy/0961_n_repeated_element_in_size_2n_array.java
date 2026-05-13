/*
Problem: N-Repeated Element in Size 2N Array
Problem No: 961
Platform: LeetCode
Difficulty: Easy
Topics: Array, Hash Table
Contest: Weekly Contest 116
Language: Java

----------------------------------
Problem Statement:
----------------------------------
You are given an integer array nums such that:
- nums.length == 2 * n
- nums contains n + 1 unique elements
- Exactly one element is repeated n times

Return the element that is repeated n times.

----------------------------------
Approach / Explanation:
----------------------------------
1. Use a HashMap to count the frequency of each element.
2. Traverse the array and update frequency.
3. Traverse again to find the element whose frequency is not 1.
4. Return that element.

----------------------------------
Tech Used:
----------------------------------
- Java
- HashMap
- Arrays

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (map.get(num) != 1) {
                return num;
            }
        }

        return -1;
    }
}
