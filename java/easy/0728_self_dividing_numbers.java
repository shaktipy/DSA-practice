/*
Problem: Self Dividing Numbers
Problem No: 728
Platform: LeetCode
Difficulty: Easy
Topics: Math
Contest: Weekly Contest 59
Language: Java

----------------------------------
Problem Statement:
----------------------------------
A self-dividing number is a number that is divisible by every digit it contains.

- A self-dividing number must not contain the digit 0.
- Given two integers left and right, return a list of all self-dividing numbers
  in the range [left, right].

----------------------------------
Approach / Explanation:
----------------------------------
1. Iterate through all numbers from left to right.
2. For each number, check every digit:
   - If any digit is 0 → not valid.
   - If the number is not divisible by the digit → not valid.
3. If all digits satisfy the condition, add the number to the result list.
4. Return the list.

----------------------------------
Tech Used:
----------------------------------
- Java
- Math
- ArrayList

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isSelfDividing(int num) {
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}
