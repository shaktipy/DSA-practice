/*
Problem: Binary Gap
Platform: LeetCode
Difficulty: Easy
Topics: Bit Manipulation
Contest: Weekly Contest 93

----------------------------------
Problem Statement:
----------------------------------
Given a positive integer n, find the longest distance between
any two adjacent 1's in the binary representation of n.

Distance is the difference between the bit positions of the two 1's.
If there are fewer than two 1's, return 0.

----------------------------------
Approach:
----------------------------------
- Traverse bits of n from LSB to MSB.
- Track the position of the previous '1'.
- When a new '1' is found, calculate distance with previous '1'.
- Keep updating the maximum distance.

----------------------------------
Time Complexity: O(log n)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int binaryGap(int n) {
        int lastPos = -1;
        int maxGap = 0;
        int pos = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                if (lastPos != -1) {
                    maxGap = Math.max(maxGap, pos - lastPos);
                }
                lastPos = pos;
            }
            n >>= 1;
            pos++;
        }

        return maxGap;
    }
}
