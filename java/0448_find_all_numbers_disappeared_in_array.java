/*
Problem: Find All Numbers Disappeared in an Array
Platform: LeetCode
Problem No: 448
Difficulty: Easy

------------------------------------------------
Problem Understanding:
------------------------------------------------
Array size = n
Elements range = [1, n]

Hume find karna hai ki range [1, n] ke
kaun se numbers array me missing hain.

Example:
nums = [4,3,2,7,8,2,3,1]

Range hona chahiye:
1 2 3 4 5 6 7 8

Array me:
1 2 3 4 7 8 present

Missing:
5 6

------------------------------------------------
Key Idea (Index Marking Trick):
------------------------------------------------
Since values range [1, n] hai,
hum value ko index me convert kar sakte hain.

value → index = value - 1

Hum us index ko negative mark kar denge
taaki pata chale ki wo number present hai.

Example:

nums = [4,3,2,7,8,2,3,1]

Step 1:
4 → index 3 → mark nums[3] negative

Step 2:
3 → index 2 → mark nums[2] negative

Step 3:
2 → index 1 → mark nums[1] negative

...continue

End me jo indices positive bachenge
unke numbers missing honge.

------------------------------------------------
Algorithm:
------------------------------------------------
1. Array traverse karo
2. index = abs(nums[i]) - 1
3. Agar nums[index] positive hai
       nums[index] *= -1

4. Fir dobara traverse karo
5. Agar nums[i] positive hai
       missing number = i + 1

------------------------------------------------
Time Complexity:
O(n)

Space Complexity:
O(1)  (excluding result list)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int index = Math.abs(nums[i]) - 1;

            if (nums[index] > 0) {
                nums[index] *= -1;
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
