/*
Problem: List the Products Ordered in a Period
Platform: LeetCode
Difficulty: Easy
Topics: SQL, JOIN, GROUP BY, Filtering

----------------------------------
Problem Statement:
----------------------------------
Given Products and Orders tables,
find the product names and total units
that have at least 100 units ordered
in February 2020.

----------------------------------
Approach:
----------------------------------
1. JOIN Products and Orders on product_id
2. Filter orders only from February 2020
3. GROUP BY product_id and product_name
4. SUM the units for each product
5. Use HAVING to keep products with total units >= 100

----------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

SELECT 
    p.product_name,
    SUM(o.unit) AS unit
FROM Products p
JOIN Orders o
ON p.product_id = o.product_id
WHERE o.order_date BETWEEN '2020-02-01' AND '2020-02-29'
GROUP BY p.product_id, p.product_name
HAVING SUM(o.unit) >= 100;
