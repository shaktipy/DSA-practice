/*
Problem: Delete Duplicate Emails
Platform: LeetCode
Problem No: 196
Difficulty: Easy

------------------------------------------------
Problem Statement:
------------------------------------------------
Given a table Person with columns (id, email),
delete all duplicate emails such that only one
unique email remains.

For duplicate emails, keep the row with the
smallest id.

------------------------------------------------
Approach (Self Join + DELETE):
------------------------------------------------
1. Perform a self join on Person table.
2. Match rows having the same email.
3. Delete the row with the larger id.
4. Smaller id is preserved automatically.

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

DELETE p1
FROM Person p1
JOIN Person p2
ON p1.email = p2.email
AND p1.id > p2.id;
