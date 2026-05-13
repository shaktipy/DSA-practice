/*
Problem: Replace Elements with Greatest Element on Right Side
Platform: LeetCode
Problem No: 1299
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Har element ko uske right side ke greatest element se replace karna hai
- Last element ko -1 se replace karenge
- Right se left traverse karenge
- Ek variable max_right maintain karenge
    - Initially max_right = -1
- Har step par:
    - Current value store karo
    - arr[i] = max_right
    - max_right update karo agar current bada ho

------------------------------------------------
Algorithm:
------------------------------------------------
1. max_right = -1
2. i = n-1 se 0 tak loop
      - current = arr[i]
      - arr[i] = max_right
      - Agar current > max_right:
            max_right = current
3. Return arr

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int[] replaceElements(int[] arr) {

        int max_right = -1;

        for (int i = arr.length - 1; i >= 0; i--) {

            int current = arr[i];
            arr[i] = max_right;

            if (current > max_right) {
                max_right = current;
            }
        }

        return arr;
    }
}
