/*
Problem: Minimum Index Sum of Two Lists
Problem No: 599
Platform: LeetCode
Difficulty: Easy
Topics: Array, Hash Table, String
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given two arrays of strings list1 and list2, find the common strings
with the least index sum.

If a common string appears at index i in list1 and index j in list2,
then its index sum is i + j.

Return all common strings with the minimum index sum.
The answer can be returned in any order.

----------------------------------
Approach / Explanation:
----------------------------------
1. Store all strings of list1 in a HashMap with their indices.
2. Traverse list2 and check if the current string exists in the map.
3. If it exists:
   - Calculate index sum (i + j).
   - If index sum is smaller than current minimum:
       - Clear result list and update minimum.
   - If index sum equals current minimum:
       - Add string to result list.
4. Convert the result list to an array and return it.

----------------------------------
Tech Used:
----------------------------------
- Java
- HashMap
- ArrayList

----------------------------------
Solution:
----------------------------------
*/

import java.util.*;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();

        // Store list1 elements with indices
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        // Traverse list2 and find minimum index sum
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int sum = j + map.get(list2[j]);

                if (sum < minSum) {
                    result.clear();
                    result.add(list2[j]);
                    minSum = sum;
                } else if (sum == minSum) {
                    result.add(list2[j]);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}
