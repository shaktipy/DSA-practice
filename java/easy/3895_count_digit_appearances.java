/*
Problem: Count Digit Appearances
Platform: LeetCode
Problem No: 3895
Difficulty: Medium
Contest: Biweekly Contest 180

------------------------------------------------
Approach:
------------------------------------------------
- Har number ke digits ko individually check karte hain
- Har element ke liye:
      → number ko repeatedly divide karte hain (digit extract karne ke liye)
      → last digit nikalte hain using % 10
- Agar extracted digit given digit ke equal hai → count increment
- Ye process sab numbers ke liye repeat hota hai

------------------------------------------------
Algorithm:
------------------------------------------------
1. ans = 0
2. Har element nums[i] ke liye:
      - x = nums[i]
      - Jab tak x != 0:
            r = x % 10
            Agar r == digit → ans++
            x = x / 10
3. Return ans

------------------------------------------------
Time Complexity: O(n * d)  (d = digits per number)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            while (x != 0) {
                int r = x % 10;
                if (r == digit) {
                    ans++;
                }
                x = x / 10;
            }
        }
        return ans;
    }
}
