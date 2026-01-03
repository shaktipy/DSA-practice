/*
Problem: Average Salary Excluding the Minimum and Maximum Salary
Problem No: 1491
Platform: LeetCode
Difficulty: Easy
Topics: Array, Sorting
Contest: Biweekly Contest 29
Language: Java

----------------------------------
Problem Statement:
----------------------------------
You are given an array of unique integers salary where salary[i] is the salary of the i-th employee.

Return the average salary of employees excluding the minimum and maximum salary.

----------------------------------
Approach / Explanation:
----------------------------------
1. Find the minimum and maximum salary in the array.
2. Calculate the total sum of all salaries.
3. Subtract minimum and maximum from the sum.
4. Divide the remaining sum by (n - 2) to get the average.

----------------------------------
Tech Used:
----------------------------------
- Java
- Array
- Math

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int s : salary) {
            sum += s;
            min = Math.min(min, s);
            max = Math.max(max, s);
        }

        return (double) (sum - min - max) / (salary.length - 2);
    }
}
