/*
Problem: Smallest Missing Integer Greater Than Sequential Prefix Sum
Platform: LeetCode
Problem No: 2996
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Pehle longest sequential prefix find karna hai.
  Sequential prefix ka matlab:

      nums[j] = nums[j-1] + 1

Example:
[1,2,3,2,5]
Sequential prefix → [1,2,3]

- Us prefix ka sum calculate karenge.

Example:
1 + 2 + 3 = 6

- Ab hume smallest integer x find karna hai
  jo array me present na ho aur
  x >= prefixSum ho.

- Fast lookup ke liye array ke elements
  HashSet me store karenge.

- x = prefixSum se start karke
  jab tak set me exist karta hai
  x++ karte rahenge.

- Jo first missing value milegi
  wahi answer hogi.

------------------------------------------------
Algorithm:
------------------------------------------------
1. HashSet create karo aur nums ke
   sab elements usme store karo.

2. prefixSum = nums[0]

3. i = 1 se array traverse karo:
      agar nums[i] == nums[i-1] + 1
            prefixSum += nums[i]
      warna break

4. x = prefixSum

5. Jab tak set.contains(x):
      x++

6. return x

------------------------------------------------
Time Complexity: O(n)

Where:
n = number of elements in nums

Space Complexity: O(n)   (HashSet)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public int missingInteger(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int prefixSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1] + 1) {
                prefixSum += nums[i];
            } else {
                break;
            }
        }

        int x = prefixSum;

        while (set.contains(x)) {
            x++;
        }

        return x;
    }
}
