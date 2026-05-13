/*
Problem: Find the Distance Value Between Two Arrays
Platform: LeetCode
Problem No: 1385
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Har element arr1[i] ke liye check karenge
  ki kya arr2 me koi element aisa hai
  jiske liye |arr1[i] - arr2[j]| <= d
- Agar aisa koi element mil gaya
  to arr1[i] count nahi hoga
- Agar pura arr2 check karne ke baad
  koi bhi valid element nahi mila
  to distanceValue increment karenge

------------------------------------------------
Algorithm:
------------------------------------------------
1. distanceValue = 0
2. i = 0 se arr1.length - 1
      - found = false
      - j = 0 se arr2.length - 1
            - Agar |arr1[i] - arr2[j]| <= d:
                  found = true
                  break
      - Agar found == false:
            distanceValue++
3. Return distanceValue

------------------------------------------------
Time Complexity: O(n * m)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int distanceValue = 0;

        for (int i = 0; i < arr1.length; i++) {

            boolean found = false;

            for (int j = 0; j < arr2.length; j++) {

                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                distanceValue++;
            }
        }

        return distanceValue;
    }
}
