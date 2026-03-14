/*
Problem: Excel Sheet Column Title
Platform: LeetCode
Problem No: 168
Difficulty: Easy

------------------------------------------------
Concept:
------------------------------------------------
Excel columns base-26 system follow karte hain.

A  -> 1
B  -> 2
...
Z  -> 26
AA -> 27
AB -> 28

Ye normal base-26 se thoda different hai
kyunki yaha digits 0-25 nahi balki 1-26 hote hain.

Isliye har iteration me
columnNumber ko 1 se reduce karte hain.

------------------------------------------------
Approach:
------------------------------------------------
1. Ek StringBuilder use karenge result store karne ke liye.

2. Jab tak columnNumber > 0

      columnNumber--      (important step)

      remainder = columnNumber % 26

      character = 'A' + remainder

      result ke beginning me add karenge

      columnNumber = columnNumber / 26

3. Loop khatam hone ke baad result return karenge.

------------------------------------------------
Example:
------------------------------------------------
Input: columnNumber = 28

Step 1:
28 - 1 = 27
27 % 26 = 1
'A' + 1 = B

columnNumber = 27 / 26 = 1

Step 2:
1 - 1 = 0
0 % 26 = 0
'A' + 0 = A

Result = "AB"

------------------------------------------------
Time Complexity: O(log26 n)

Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public String convertToTitle(int columnNumber) {

        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {

            columnNumber--;

            char currentChar = (char) ('A' + (columnNumber % 26));

            result.insert(0, currentChar);

            columnNumber /= 26;
        }

        return result.toString();
    }
}
