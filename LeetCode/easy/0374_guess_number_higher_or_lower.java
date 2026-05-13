/*
Problem: Guess Number Higher or Lower
Platform: LeetCode
Problem No: 374
Difficulty: Easy
Topics: Binary Search, Interactive

------------------------------------------------
Approach:
------------------------------------------------
- Ye classic Binary Search problem hai
- Range [1, n] me answer exist karta hai
- Har step par mid calculate karte hain aur guess(mid) call karte hain
- API response ke basis par search space reduce karte hain:
      → res == 0 → number mil gaya
      → res == -1 → guess bada hai → left side search
      → res == 1 → guess chhota hai → right side search

------------------------------------------------
Algorithm:
------------------------------------------------
1. low = 1, high = n
2. Jab tak low <= high:
      - mid = low + (high - low) / 2
      - res = guess(mid)
      - Agar res == 0 → return mid
      - Agar res == -1 → high = mid - 1
      - Agar res == 1 → low = mid + 1
3. Return -1 (edge case, theoretically nahi aayega)

------------------------------------------------
Time Complexity: O(log n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

/** 
 * Forward declaration of guess API.
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = guess(mid);
            
            if (res == 0) {
                return mid;
            } else if (res == -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return -1;
    }
}
