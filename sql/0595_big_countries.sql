/*
Problem: Big Countries
Problem No: 595
Platform: LeetCode
Difficulty: Easy
Topics: SQL, Filtering

----------------------------------
Problem Statement:
----------------------------------
A country is considered big if:
- area >= 3,000,000 OR
- population >= 25,000,000

Return the name, population, and area of such countries.

----------------------------------
Approach:
----------------------------------
1. Select required columns: name, population, area
2. Apply WHERE condition using OR:
   - area >= 3000000
   - population >= 25000000

----------------------------------
Solution:
----------------------------------
*/

SELECT
    name,
    population,
    area
FROM World
WHERE area >= 3000000
   OR population >= 25000000;
