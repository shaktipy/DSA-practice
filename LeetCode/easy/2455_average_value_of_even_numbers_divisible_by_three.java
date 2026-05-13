/*
Problem: Average Value of Even Numbers That Are Divisible by Three
Platform: LeetCode
Problem No: 2455
Difficulty: Easy

------------------------------------------------
Problem Understanding:
------------------------------------------------
- Array nums diya hai
- Hume un numbers ka average nikalna hai:
  jo EVEN bhi ho aur 3 se divisible bhi ho

Note:
Even + divisible by 3 → divisible by 6

------------------------------------------------
Approach:
------------------------------------------------
- Har element check karenge:
      agar nums[i] % 6 == 0
- Valid numbers ka sum aur count maintain karenge
- End me:
      average = sum / count
- Agar koi valid number nahi mila:
      return 0

------------------------------------------------
Algorithm:
------------------------------------------------
1. sum = 0, count = 0
2. Loop through array:
      if nums[i] % 6 == 0:
            sum += nums[i]
            count++
3. Agar count == 0 → return 0
4. Return sum / count

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public int averageValue(int[] nums) {

        int n = nums.length;
        int sum = 0;
        int c = 0;

        for(int i = 0; i < n; i++){

            if(nums[i] % 6 == 0){

                sum = sum + nums[i];
                c++;
            }
        }

        if(c == 0) return 0;

        return sum / c;
    }
}
