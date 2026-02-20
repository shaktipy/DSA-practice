/*
Problem: Excel Sheet Column Number
Platform: LeetCode
Problem No: 171
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Ye problem base-26 number system jaisa hai
- Har character ka value nikalo:
    'A' -> 1, 'B' -> 2, ..., 'Z' -> 26
- Pehle result ko 26 se multiply karo
- Fir current character ka value add karo

------------------------------------------------
Algorithm:
------------------------------------------------
1. result = 0
2. columnTitle ke har character par loop chalao
3. value = (char - 'A' + 1)
4. result = result * 26 + value
5. result return karo

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int titleToNumber(String columnTitle) {

        int result = 0;

        for (char c : columnTitle.toCharArray()) {
            int value = c - 'A' + 1;
            result = result * 26 + value;
        }

        return result;
    }
}
