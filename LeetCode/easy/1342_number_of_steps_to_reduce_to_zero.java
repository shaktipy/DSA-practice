/*
Problem: Number of Steps to Reduce a Number to Zero
Platform: LeetCode
Difficulty: Easy
Topics: Math, Bit Manipulation
Contest: Biweekly Contest 19
Problem No: 1342

----------------------------------
Problem Statement:
----------------------------------
Given an integer num, reduce it to zero.
In one step:
- If num is even, divide it by 2
- If num is odd, subtract 1

Return the total number of steps required.

----------------------------------
Approach:
----------------------------------
1. Initialize a counter to track steps
2. Loop until num becomes 0
3. If num is even → divide by 2
4. Else → subtract 1
5. Increment step counter each time
6. Return total steps

----------------------------------
Algorithm:
----------------------------------
while num > 0:
    if num is even:
        num = num / 2
    else:
        num = num - 1
    steps++

return steps

----------------------------------
Time Complexity: O(log n)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int numberOfSteps(int num) {
        int count = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            count++;
        }

        return count;
    }
}
