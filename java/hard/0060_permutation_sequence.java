/*
Problem: Permutation Sequence
Platform: LeetCode
Problem No: 60
Difficulty: Hard
Topics: Math, Recursion

------------------------------------------------
Approach:
------------------------------------------------
- Total permutations = n!
- Har position pe decide karte hain kaunsa number aayega
- Factorial system (factoradic) use karte hain:
      → k ko blocks me divide karte hain
- List me 1 to n numbers store karte hain
- Har step pe:
      → index = k / (n-1)!
      → us index ka number pick karte hain
      → list se remove karte hain
      → k update karte hain

------------------------------------------------
Algorithm:
------------------------------------------------
1. nums list me 1 to n store karo
2. factorial array f[] compute karo
3. k-- (0-based indexing ke liye)
4. Loop jab tak n > 0:
      - index = k / f[n-1]
      - answer me nums[index] add karo
      - nums se remove karo
      - k = k % f[n-1]
      - n--
5. Return final string

------------------------------------------------
Time Complexity: O(n^2)
Space Complexity: O(n)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution { 
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        int[] f = new int[n];
        f[0] = 1;

        for (int i = 1; i < n; i++) {
            f[i] = f[i - 1] * i;
            nums.add(i);
        }
        nums.add(n);
        
        StringBuilder sb = new StringBuilder();

        for (k--; n > 0; n--) {
            int i = k / f[n - 1];
            sb.append(nums.remove(i));
            k %= f[n - 1];
        }
        return sb.toString();
    }
}
