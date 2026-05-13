/*
Problem: Remove Duplicates from Sorted Array
Platform: LeetCode
Problem No: 26
Difficulty: Easy

------------------------------------------------
Approach (Two Pointers):
------------------------------------------------
- Array already sorted hai
- Ek pointer (index) unique elements track karega
- Jab new element mile, usse nums[index] par place kar do

------------------------------------------------
Algorithm:
------------------------------------------------
1. index = 1 se start karo
2. i = 1 se n-1 tak traverse
3. Agar nums[i] != nums[i-1]
   → nums[index] = nums[i]
   → index++

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int removeDuplicates(int[] nums) {

        int index = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}
