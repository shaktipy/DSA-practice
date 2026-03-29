/*
Problem: Check Whether Two Strings are Almost Equivalent
Platform: LeetCode
Problem No: 2068
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Dono strings ke characters ka frequency count nikalte hain
- 26 size ke 2 arrays (freq1, freq2) use karte hain
- Har character ka count store karte hain
- Fir har character ke liye difference check karte hain
- Agar kisi bhi character ka difference > 3 ho jaye → false
- Otherwise → true

------------------------------------------------
Algorithm:
------------------------------------------------
1. freq1[26], freq2[26] initialize karo
2. Loop through strings:
      - freq1[word1[i] - 'a']++
      - freq2[word2[i] - 'a']++
3. Loop i = 0 to 25:
      - Agar |freq1[i] - freq2[i]| > 3 → return false
4. Return true

------------------------------------------------
Time Complexity: O(n + 26) ≈ O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            freq1[word1.charAt(i) - 'a']++;
            freq2[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (Math.abs(freq1[i] - freq2[i]) > 3) {
                return false;
            }
        }

        return true;
    }
}
