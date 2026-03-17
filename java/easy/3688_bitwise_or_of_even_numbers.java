/*
Problem: Bitwise OR of Even Numbers in an Array
Platform: LeetCode
Problem No: 3688
Difficulty: Easy

------------------------------------------------
Problem Understanding:
------------------------------------------------
Hume array diya hai.

Task:
- Sirf even numbers consider karo
- Unka bitwise OR nikaalo
- Agar koi even number nahi hai → return 0

------------------------------------------------
Example:
------------------------------------------------
nums = [1,2,3,4,5,6]

Even numbers:
2, 4, 6

Bitwise OR:
2 | 4 = 6
6 | 6 = 6

Answer = 6

------------------------------------------------
Approach:
------------------------------------------------
1. result = 0

2. Array traverse karo:
      Agar number even hai (num % 2 == 0)
            result = result | num

3. result return karo

------------------------------------------------
Time Complexity:
O(n)

Space Complexity:
O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public int evenNumberBitwiseORs(int[] nums) {

        int result = 0;

        for (int num : nums) {

            // check even
            if (num % 2 == 0) {

                result = result | num;
            }
        }

        return result;
    }
}
