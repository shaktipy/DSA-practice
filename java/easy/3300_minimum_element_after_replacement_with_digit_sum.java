/*
Problem: Minimum Element After Replacement With Digit Sum
Platform: LeetCode
Problem No: 3300
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Har element ko uske digit sum se replace karna hai.

Example:
10 -> 1 + 0 = 1
12 -> 1 + 2 = 3
999 -> 9 + 9 + 9 = 27

- Pehle array ke har number ka digit sum calculate
  karke usko replace kar denge.

- Fir updated array me minimum element find karenge.

------------------------------------------------
Algorithm:
------------------------------------------------
1. Array ke har element ke liye:
      - n = nums[i]
      - sum = 0
      - Jab tak n > 0:
            sum += n % 10
            n = n / 10
      - nums[i] = sum

2. minVal = Integer.MAX_VALUE

3. Array traverse karo:
      - agar nums[i] < minVal
            minVal = nums[i]

4. return minVal

------------------------------------------------
Time Complexity: O(n * d)

Where:
n = number of elements
d = digits in each number

Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public int minElement(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int n = nums[i];
            int sum = 0;

            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

            nums[i] = sum;
        }

        int minVal = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minVal) {
                minVal = nums[i];
            }
        }

        return minVal;
    }
}
