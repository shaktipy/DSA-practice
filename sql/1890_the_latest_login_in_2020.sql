/*
Problem: The Latest Login in 2020
Platform: LeetCode
Problem No: 1890
Difficulty: Easy

------------------------------------------------
Problem Statement:
------------------------------------------------
Report the latest login for each user in the year 2020.
Exclude users who did not log in during 2020.

------------------------------------------------
Approach:
------------------------------------------------
1. Filter records where YEAR(time_stamp) = 2020
2. Group by user_id
3. Use MAX(time_stamp) to get latest login

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

SELECT
    user_id,
    MAX(time_stamp) AS last_stamp
FROM
    Logins
WHERE
    YEAR(time_stamp) = 2020
GROUP BY
    user_id;
