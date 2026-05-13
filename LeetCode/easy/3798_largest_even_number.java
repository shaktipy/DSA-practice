/*
Problem: Largest Even Number
Platform: LeetCode
Problem No: 3798
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Hume string se largest even number banana hai
- Even number hone ke liye last digit '2' hona zaroori hai
- String me last '2' ka index find karte hain
- Us index tak ka substring longest valid even number hoga
- Agar '2' nahi mila → even number possible nahi → return ""

------------------------------------------------
Algorithm:
------------------------------------------------
1. lastTwoIndex = lastIndexOf('2')
2. Agar lastTwoIndex == -1:
      → return ""
3. Return substring(0, lastTwoIndex + 1)

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public String largestEven(String s) {
        int lastTwoIndex = s.lastIndexOf('2');

        if (lastTwoIndex == -1) {
            return "";
        }

        return s.substring(0, lastTwoIndex + 1);
    }
}
