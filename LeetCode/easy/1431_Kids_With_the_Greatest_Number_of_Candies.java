/*
Problem: Kids With the Greatest Number of Candies
Problem No: 1431
Platform: LeetCode
Difficulty: Easy
Topics: Array
Contest: Biweekly Contest 25 
Language: Java

----------------------------------
Problem Statement:
----------------------------------
There are n kids with candies. You are given an integer array candies,
where candies[i] represents the number of candies the ith kid has, and
an integer extraCandies.

Return a boolean array result where result[i] is true if, after giving
the ith kid all the extraCandies, they will have the greatest number of
candies among all kids, or false otherwise.

----------------------------------
Approach / Explanation:
----------------------------------
1. First find the maximum number of candies among all kids.
2. For each kid, check if candies[i] + extraCandies >= maximum.
3. If yes, add true to the result list, otherwise add false.
4. Return the boolean list.

----------------------------------
Tech Used:
----------------------------------
- Java
- Array
- ArrayList

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;

        for (int c : candies) {
            max = Math.max(max, c);
        }

        for (int c : candies) {
            result.add(c + extraCandies >= max);
        }

        return result;
    }
}
