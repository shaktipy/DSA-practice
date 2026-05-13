/*
Problem: Fruit Into Baskets
Problem No: 904
Platform: LeetCode
Difficulty: Medium
Topics: Array, Hash Table, Sliding Window, Two Pointers
Language: Java

----------------------------------
Problem Statement:
----------------------------------
You are given an integer array fruits where fruits[i] represents
the type of fruit on the ith tree.

You have only two baskets, and each basket can hold only one
type of fruit. Starting from any tree, you must collect exactly
one fruit from each tree while moving to the right.

Once you encounter a fruit that cannot fit into the baskets,
you must stop.

Return the maximum number of fruits you can collect.

----------------------------------
Approach / Explanation:
----------------------------------
1. Use the Sliding Window technique.
2. Maintain a window that contains at most 2 different fruit types.
3. Use a HashMap to store fruit type frequencies in the window.
4. Expand the right pointer to include fruits.
5. If more than 2 fruit types appear:
   - Shrink the window from the left until only 2 types remain.
6. Keep updating the maximum window size.

----------------------------------
Tech Used:
----------------------------------
- Java
- HashMap
- Sliding Window
- Two Pointers

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // If more than 2 fruit types, shrink window
            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }

            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }
}
