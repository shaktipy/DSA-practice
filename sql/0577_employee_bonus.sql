/*
Problem: Employee Bonus
Platform: LeetCode
Difficulty: Easy
Topics: SQL, Join
Problem No: 577

------------------------------------------------
Problem Statement:
------------------------------------------------
You are given two tables:

Employee:
- empId (unique)
- name
- supervisor
- salary

Bonus:
- empId (unique)
- bonus

Report the name and bonus amount of each employee who:
1. Has a bonus less than 1000
2. OR did not receive any bonus

Return the result table in any order.

------------------------------------------------
Approach:
------------------------------------------------
1. Use LEFT JOIN to join Employee with Bonus on empId
2. LEFT JOIN ensures employees without bonus are included
3. Filter rows where:
   - bonus < 1000
   - OR bonus IS NULL

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

SELECT 
    e.name,
    b.bonus
FROM Employee e
LEFT JOIN Bonus b
ON e.empId = b.empId
WHERE b.bonus < 1000 OR b.bonus IS NULL;
