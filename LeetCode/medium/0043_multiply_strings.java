/*
Problem: Multiply Strings
Platform: LeetCode
Difficulty: Medium
Problem No: 43

------------------------------------------------
Problem Statement:
------------------------------------------------
 * # Multiply Strings
 *
 * Can you solve this real interview question? Multiply Strings - Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
 *
 * Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
 *
 *  
 *
 * Example 1:
 *
 * Input: num1 = "2", num2 = "3"
 * Output: "6"
 *
 *
 * Example 2:
 *
 * Input: num1 = "123", num2 = "456"
 * Output: "56088"

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public String multiply(String num1, String num2) {
        // Edge case: if either number is "0", the product is "0"
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n];
        
        // Multiply from right to left
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                
                // Indices in the result array where the digits belong
                int p1 = i + j;
                int p2 = i + j + 1;
                
                // Add the multiplication result to the current value at position p2
                int sum = mul + result[p2];
                
                // Store the carry at p1 and the single digit at p2
                result[p1] += sum / 10;
                result[p2] = sum % 10;
            }
        }
        
        // Convert the array to a final string builder
        StringBuilder sb = new StringBuilder();
        for (int digit : result) {
            // Skip leading zeros
            if (!(sb.length() == 0 && digit == 0)) {
                sb.append(digit);
            }
        }
        
        return sb.toString();
    }
}