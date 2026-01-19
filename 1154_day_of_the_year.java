/*
Problem: Day of the Year
Platform: LeetCode
Difficulty: Easy
Problem No: 1154
Contest: Weekly Contest 149

------------------------------------------------
Problem Statement:
------------------------------------------------
Given a string date in the format YYYY-MM-DD,
return the day number of the year for that date.

------------------------------------------------
Approach:
------------------------------------------------
1. Parse year, month, and day from the string.
2. Use an array to store number of days in each month.
3. Check if the given year is a leap year:
   - Leap year if divisible by 400 OR
   - Divisible by 4 and not divisible by 100
4. Add days of all previous months.
5. Add current day.

------------------------------------------------
Time Complexity: O(1)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int dayOfYear(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29;
        }

        int dayOfYear = 0;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }
        dayOfYear += day;

        return dayOfYear;
    }
}
