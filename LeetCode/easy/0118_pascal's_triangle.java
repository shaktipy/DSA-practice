/*
Problem: Pascal's Triangle
Platform: LeetCode
Problem No: 118
Difficulty: Easy

------------------------------------------------
Problem Understanding:
------------------------------------------------
- Pascal Triangle me har row ka first aur last element = 1 hota hai
- Baaki elements = upar ke 2 elements ka sum

Example:
Row 3 → [1, 2, 1]
(2 = 1 + 1)

------------------------------------------------
Optimized Approach:
------------------------------------------------
- Har row ko combination formula se generate kar sakte hain

Formula:
C(n, r) = C(n, r-1) * (n - r + 1) / r

- Isse bina extra space ke row generate hoti hai
- Overflow avoid karne ke liye long use kiya

------------------------------------------------
Algorithm:
------------------------------------------------
1. Har row ke liye loop chalao (0 → numRows-1)
2. val = 1 se start karo
3. Har element add karo row me
4. Next value calculate karo:
      val = val * (i - j) / (j + 1)
5. Row ko answer me add karo
6. Return result

------------------------------------------------
Time Complexity: O(n^2)
Space Complexity: O(n^2)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            long val = 1;
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                row.add((int) val);
                val = val * (i - j) / (j + 1);
            }

            ans.add(row);
        }

        return ans;
    }
}
