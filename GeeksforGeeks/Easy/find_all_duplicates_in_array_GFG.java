/*
Problem: Find All Duplicates in an Array
Platform: GeeksforGeeks (GFG)
Difficulty: Easy
Topics: Arrays, Hashing, In-place

----------------------------------
Problem Statement:
----------------------------------
Given an array arr[] of size n containing elements from 1 to n,
where each element appears at most twice.
Return all the integers that appear twice.

----------------------------------
Approach:
----------------------------------
Use index marking technique:
- Traverse the array
- For each element x, go to index |x|-1
- If value at that index is already negative → duplicate found
- Else mark it negative

This works because values are in range [1, n].

----------------------------------
Time Complexity: O(n)
Space Complexity: O(1) (excluding output array)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
         ArrayList<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) {
                duplicates.add(Math.abs(arr[i]));
            } else {
                arr[index] = -arr[index];
            }
        }
        return duplicates;
    }
}

