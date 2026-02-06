/*
Problem: Find Numbers with Even Number of Digits
Platform: LeetCode
Problem No: 1295
Difficulty: Easy
Contest: Weekly Contest 168

------------------------------------------------
Approach:
------------------------------------------------
- Har number ke digits count karo
- Agar digits even hain → count increase karo

------------------------------------------------
Algorithm:
------------------------------------------------
1. count = 0
2. nums array traverse karo
3. Har number ke digits nikaalo
4. Agar digits % 2 == 0 → count++

------------------------------------------------
Time Complexity: O(n * d)
(d = digits per number, max 5)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;

        for (int num : nums) {
            int digits = 0;

            while (num > 0) {
                digits++;
                num /= 10;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
