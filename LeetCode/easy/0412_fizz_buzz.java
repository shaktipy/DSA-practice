/*
Problem: Fizz Buzz
Problem No: 412
Platform: LeetCode
Difficulty: Easy
Topics: Math, String, Simulation
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given an integer n, return a string array answer (1-indexed) where:
- "FizzBuzz" if i is divisible by 3 and 5
- "Fizz" if i is divisible by 3
- "Buzz" if i is divisible by 5
- i (as a string) if none of the above conditions are true

----------------------------------
Approach / Explanation:
----------------------------------
1. Iterate from 1 to n.
2. Check divisibility rules in correct order:
   - First divisible by both 3 and 5.
   - Then divisible by 3.
   - Then divisible by 5.
3. Add the appropriate string to the result list.
4. Return the list.

----------------------------------
Tech Used:
----------------------------------
- Java
- ArrayList
- Modulo Operator

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }

        return list;
    }
}
