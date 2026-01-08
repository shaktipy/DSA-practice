/*
Problem: Rising Temperature
Platform: LeetCode
Difficulty: Easy
Topics: SQL, Self Join

----------------------------------
Problem Statement:
----------------------------------
Given a Weather table with daily temperatures,
find the ids of days where the temperature is higher
than the previous day (yesterday).

----------------------------------
Approach:
----------------------------------
1. Use SELF JOIN on Weather table
2. Join current day with previous day
   using DATE difference = 1
3. Compare temperatures
4. Return current day's id if temperature increased

----------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

SELECT w1.id
FROM Weather w1
JOIN Weather w2
ON DATEDIFF(w1.recordDate, w2.recordDate) = 1
AND w1.temperature > w2.temperature;
