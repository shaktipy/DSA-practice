/*
Problem: Sum of All Subset XOR Totals
Platform: LeetCode
Problem No: 1863
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Har subset ka XOR nikalna hai aur unka sum return karna hai
- DFS (recursion) use karke saare subsets generate karte hain
- Har element ke liye 2 choices:
      1. Include karo → currXor ^ nums[i]
      2. Exclude karo → currXor same rahega
- Jab end pe pahunch jao → currXor ko answer me add karo

------------------------------------------------
Algorithm:
------------------------------------------------
1. ans = 0
2. DFS call karo (index = 0, currXor = 0)
3. Agar index == nums.length:
      → ans += currXor
      → return
4. Include current element:
      dfs(index + 1, currXor ^ nums[index])
5. Exclude current element:
      dfs(index + 1, currXor)
6. Return ans

------------------------------------------------
Time Complexity: O(2^n)
Space Complexity: O(n) (recursion stack)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    int ans = 0;

    public int subsetXORSum(int[] nums) {
        dfs(nums, 0, 0);
        return ans;
    }

    void dfs(int[] nums, int index, int currXor) {
        if (index == nums.length) {
            ans += currXor;
            return;
        }

        // include nums[index]
        dfs(nums, index + 1, currXor ^ nums[index]);

        // exclude nums[index]
        dfs(nums, index + 1, currXor);
    }
}
