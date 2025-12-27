/*
Problem: Rank Scores
Problem No: 178
Platform: LeetCode
Section: SQL

----------------------------------
Problem Statement:
----------------------------------
Given a table:
Scores(id, score)

Each row contains the score of a game.
The task is to find the rank of each score based on the following rules:

1. Scores should be ranked from highest to lowest.
2. If two scores are the same, they should have the same rank.
3. After a tie, the next rank should be the next consecutive integer.
   (No gaps between ranks.)

The result should be ordered by score in descending order.

----------------------------------
Approach / Explanation:
----------------------------------
1. Use the DENSE_RANK() window function.
2. Order scores in descending order inside the window function.
3. DENSE_RANK() ensures:
   - Same rank for equal scores.
   - No gaps in ranking after ties.
4. Select score and calculated rank.
5. Order the final result by score in descending order.

----------------------------------
Tech Used:
----------------------------------
- SQL
- Window Functions
- DENSE_RANK()
- ORDER BY

----------------------------------
Solution:
----------------------------------
*/

SELECT 
    score,
    DENSE_RANK() OVER (ORDER BY score DESC) AS `rank`
FROM Scores
ORDER BY 
    score DESC;
