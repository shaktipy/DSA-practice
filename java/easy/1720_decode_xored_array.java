/*
Problem: Decode XORed Array
Platform: LeetCode
Problem No: 1720
Difficulty: Easy
Contest: Weekly Contest 223
Topics: Array, Bit Manipulation

------------------------------------------------
Approach:
------------------------------------------------
- Given hai:
      → encoded[i] = arr[i] XOR arr[i+1]
- Hume arr reconstruct karna hai
- First element already given hai (arr[0] = first)
- XOR property use karte hain:
      → arr[i+1] = arr[i] XOR encoded[i]
- Isse step by step pura array build ho jayega

------------------------------------------------
Algorithm:
------------------------------------------------
1. n = encoded.length
2. Create arr of size n + 1
3. arr[0] = first
4. Loop i from 0 to n-1:
      - arr[i+1] = arr[i] ^ encoded[i]
5. Return arr

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(n)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] arr = new int[n + 1];

        arr[0] = first;

        for (int i = 0; i < n; i++) {
            arr[i + 1] = arr[i] ^ encoded[i];
        }

        return arr;
    }
}
