/*
Problem: Valid Digit Number
Platform: LeetCode
Problem No: 3908
Difficulty: Easy
Contest: Biweekly Contest 181
Topics: Math, Array

------------------------------------------------
Approach:
------------------------------------------------
- Number ke digits extract karte hain
- Conditions:
      → at least ek baar digit x present ho
      → first digit x nahi hona chahiye
- Number ko digit array me convert karte hain
- First digit check:
      → agar arr[0] == x → false
- Baaki digits me:
      → agar kahin bhi x mila → true

------------------------------------------------
Algorithm:
------------------------------------------------
1. n ke digits count karo
2. digits ko array me store karo
3. Loop through array:
      - Agar first digit == x → return false
      - Agar koi aur digit == x → return true
4. Agar x nahi mila → return false

------------------------------------------------
Time Complexity: O(d)   (d = number of digits)
Space Complexity: O(d)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public boolean validDigit(int n, int x) {
        int temp = n;
        int i = 0;

        while (temp != 0) {
            i++;
            temp = temp / 10;
        }

        int arr[] = new int[i];
        temp = n;
        int index = i - 1;

        while (temp != 0) {
            arr[index--] = temp % 10;
            temp = temp / 10;
        }

        for (int k = 0; k < i; k++) {
            if (k == 0 && arr[k] == x) {
                return false;
            } else if (arr[k] == x) {
                return true;
            }
        }

        return false;
    }
}
