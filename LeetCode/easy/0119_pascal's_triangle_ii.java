/*
Problem: Pascal's Triangle II
Platform: LeetCode
Problem No: 119
Difficulty: Easy

------------------------------------------------
Problem Understanding:
------------------------------------------------
- Pascal Triangle ki specific row return karni hai (0-indexed)
- Har element = combination value hota hai

Example:
rowIndex = 3 → [1,3,3,1]

------------------------------------------------
Optimized Approach:
------------------------------------------------
- Direct combination formula use karte hain

C(n, r) = C(n, r-1) * (n - r + 1) / r

- Isse bina extra space ke ek hi row generate ho jaati hai
- Long use kiya overflow avoid karne ke liye

------------------------------------------------
Algorithm:
------------------------------------------------
1. val = 1 se start karo
2. Loop i = 0 → rowIndex
3. Har step pe val add karo list me
4. Next value:
      val = val * (n - i) / (i + 1)
5. Return list

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1) (excluding output)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public List<Integer> getRow(int rowIndex) {

        List<Integer> ans = new ArrayList<>();
        long val = 1;
        int n = rowIndex;

        for (int i = 0; i <= n; i++) {

            ans.add((int) val);
            val = val * (n - i) / (i + 1);
        }

        return ans;
    }
}
