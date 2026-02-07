/*
Problem: Count Monobit Integers
Platform: LeetCode
Problem No: 3827
Difficulty: Easy
Contest: Weekly Contest 487

------------------------------------------------
Problem Statement:
------------------------------------------------
An integer is called Monobit if all bits in its binary
representation are the same.

Count Monobit integers in range [0, n].

------------------------------------------------
Observation:
------------------------------------------------
Monobit numbers are:
0  -> "0"
1  -> "1"
3  -> "11"
7  -> "111"
15 -> "1111"
...
i.e. numbers of the form (2^k - 1)

------------------------------------------------
Approach:
------------------------------------------------
1. Start from k = 1
2. Generate monobit numbers using (2^k - 1)
3. Count how many are <= n
4. Add 1 to include 0

------------------------------------------------
Time Complexity: O(log n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int countMonobit(int n) {

        int count = 0;
        int k = 1;

        while ((int)Math.pow(2, k) - 1 <= n) {
            count++;
            k++;
        }

        return count + 1;
    }
}
