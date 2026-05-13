/*
Problem: Subtract the Product and Sum of Digits of an Integer
Platform: LeetCode
Difficulty: Easy
Topics: Math
Contest: Weekly Contest 166
Problem No: 1281

----------------------------------
Problem Statement:
----------------------------------
Given an integer n, find the difference between:
- the product of its digits
- the sum of its digits

Return (product - sum).

----------------------------------
Approach:
----------------------------------
1. Initialize product = 1 and sum = 0
2. Extract digits one by one using n % 10
3. Add digit to sum
4. Multiply digit with product
5. Remove last digit using n / 10
6. Return product - sum

----------------------------------
Algorithm:
----------------------------------
while n > 0:
    digit = n % 10
    sum += digit
    product *= digit
    n /= 10

return product - sum

----------------------------------
Time Complexity: O(d)
Space Complexity: O(1)
(where d = number of digits)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;
        }

        return product - sum;
    }
}
