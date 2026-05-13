/*
Problem: Final Value of Variable After Performing Operations
Problem No: 2011
Platform: LeetCode
Difficulty: Easy
Topics: Array, String, Simulation
Contest: Weekly Contest 259
Language: Java

----------------------------------
Problem Statement:
----------------------------------
There is a variable X initially set to 0 and a list of operations.

Operations can be:
- "++X" or "X++" → increment X by 1
- "--X" or "X--" → decrement X by 1

Given an array of strings operations, return the final value of X
after performing all operations.

----------------------------------
Approach / Explanation:
----------------------------------
1. Initialize X = 0.
2. Traverse each operation in the array.
3. If the operation contains '+', increment X.
4. Otherwise, decrement X.
5. Return the final value of X.

----------------------------------
Tech Used:
----------------------------------
- Java
- Array
- String
- Simulation

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for (String op : operations) {
            if (op.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }

        return x;
    }
}
