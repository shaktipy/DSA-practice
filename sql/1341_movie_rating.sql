/*
Problem: Movie Rating
Problem No: 1341
Platform: LeetCode
Section: SQL

----------------------------------
Problem Statement:
----------------------------------
Given three tables:
1. Movies(movie_id, title)
2. Users(user_id, name)
3. MovieRating(movie_id, user_id, rating, created_at)

Tasks:
1. Find the name of the user who has rated the greatest number of movies.
   - In case of a tie, return the lexicographically smaller user name.
2. Find the movie name with the highest average rating in February 2020.
   - In case of a tie, return the lexicographically smaller movie name.

The result should return two rows:
- First row: user name
- Second row: movie title

----------------------------------
Approach / Explanation:
----------------------------------
1. Join MovieRating with Users table.
2. Group by user_id and user name to count distinct movies rated by each user.
3. Sort by count descending and name ascending to handle tie cases.
4. Limit the result to one row.

5. Join MovieRating with Movies table.
6. Filter ratings only for February 2020.
7. Group by movie_id and title to calculate average rating.
8. Sort by average rating descending and title ascending to handle tie cases.
9. Limit the result to one row.

10. Combine both results using UNION ALL.

----------------------------------
Tech Used:
----------------------------------
- SQL
- JOINs
- GROUP BY
- COUNT()
- AVG()
- ORDER BY
- UNION ALL

----------------------------------
Solution:
----------------------------------
*/

(
    SELECT 
        u.name AS results
    FROM MovieRating mr
    JOIN Users u 
        ON mr.user_id = u.user_id
    GROUP BY 
        u.user_id, 
        u.name
    ORDER BY 
        COUNT(DISTINCT mr.movie_id) DESC,
        u.name ASC
    LIMIT 1
)

UNION ALL

(
    SELECT 
        m.title AS results
    FROM MovieRating mr
    JOIN Movies m 
        ON mr.movie_id = m.movie_id
    WHERE mr.created_at BETWEEN '2020-02-01' AND '2020-02-29'
    GROUP BY 
        m.movie_id, 
        m.title
    ORDER BY 
        AVG(mr.rating) DESC,
        m.title ASC
    LIMIT 1
);
