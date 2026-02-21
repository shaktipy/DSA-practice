/*
Problem: Find Xor-Beauty of Array
Platform: LeetCode
Problem No: 2527
Difficulty: Medium

------------------------------------------------
Key Observation:
------------------------------------------------
- Given expression: ((nums[i] | nums[j]) & nums[k])
- All possible (i, j, k) triplets ka XOR lena hai
- Bitwise property se ye simplify ho jata hai

👉 Final Result = XOR of all elements in nums

Reason:
- Har bit independently behave karti hai
- Even number of contributions cancel ho jate hain (XOR property)
- Sirf nums[i] ka direct XOR bachta hai

------------------------------------------------
Algorithm:
------------------------------------------------
1. xorSum = 0
2. Array ke har element ka XOR le lo
3. xorSum return karo

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int xorBeauty(int[] nums) {

        int xorSum = 0;

        for (int i = 0; i < nums.length; i++) {
            xorSum ^= nums[i];
        }

        return xorSum;
    }
}
