/*
Problem: Sum of Beauty of All Substrings
Platform: LeetCode
Problem No: 1781
Difficulty: Medium

------------------------------------------------
Approach:
------------------------------------------------
- Har possible substring ka beauty nikalna hai
- Beauty = (max frequency - min frequency) among characters
- Outer loop se substring ka start fix
- Inner loop se end badhate jao
- Frequency array (size 26) maintain karo
- Har step pe max aur min frequency calculate karo

------------------------------------------------
Algorithm:
------------------------------------------------
1. result = 0
2. i = 0 se n-1 tak loop
   - freq[26] = {0}
3. j = i se n-1 tak loop
   - current character ki frequency badhao
   - freq array me se max aur min (non-zero) nikalo
   - result += (max - min)
4. result return karo

------------------------------------------------
Time Complexity: O(n^2 * 26) ≈ O(n^2)
Space Complexity: O(26) ≈ O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int beautySum(String s) {

        int n = s.length();
        int result = 0;

        for (int i = 0; i < n; i++) {

            int[] freq = new int[26];

            for (int j = i; j < n; j++) {

                freq[s.charAt(j) - 'a']++;

                int max = 0;
                int min = n;

                for (int f : freq) {
                    if (f > 0) {
                        if (f > max) max = f;
                        if (f < min) min = f;
                    }
                }

                result += (max - min);
            }
        }

        return result;
    }
}
