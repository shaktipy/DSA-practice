/*
Problem: Reverse String Prefix
Platform: LeetCode
Problem No: 3794
Difficulty: Easy
Contest: Biweekly Contest 173
Topics: Two Pointers, String

------------------------------------------------
Approach:
------------------------------------------------
- String immutable hoti hai, isliye char array use karte hain
- Sirf first k characters reverse karne hain
- Two pointers approach use karte hain:
      → left = 0
      → right = k - 1
- Dono characters swap karte hain jab tak left < right

------------------------------------------------
Algorithm:
------------------------------------------------
1. String ko char array me convert karo
2. left = 0, right = k - 1
3. Jab tak left < right:
      - chars[left] aur chars[right] swap karo
      - left++
      - right--
4. Char array ko string me convert karke return karo

------------------------------------------------
Time Complexity: O(k)
Space Complexity: O(n)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public String reversePrefix(String s, int k) {
        char[] chars = s.toCharArray();

        int left = 0;
        int right = k - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }
}
