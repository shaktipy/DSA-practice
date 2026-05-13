/*
Problem: Count Primes
Platform: LeetCode
Problem No: 204
Difficulty: Medium

------------------------------------------------
Approach:
------------------------------------------------
- Hume n se chhote saare prime numbers count karne hain.

- Is problem ko efficiently solve karne ke liye
  **Sieve of Eratosthenes** algorithm use karte hain.

- Idea:
  1. Ek boolean array banate hain jisme initially
     sab numbers ko prime assume karte hain.
  2. Phir 2 se start karke uske multiples ko
     non-prime mark kar dete hain.
  3. Yeh process sqrt(n) tak chalti hai.

Example:
n = 10

Initially:
2,3,4,5,6,7,8,9 → prime assume

2 ke multiples remove:
4,6,8

3 ke multiples remove:
9

Remaining primes:
2,3,5,7 → count = 4

------------------------------------------------
Algorithm:
------------------------------------------------
1. Agar n <= 2
      return 0

2. boolean array isPrime[n] create karo

3. i = 2 se n-1 tak:
      isPrime[i] = true

4. p = 2 se start karo jab tak p * p < n:
      agar isPrime[p] true hai
            p ke multiples mark false karo
            (start from p * p)

5. 2 se n-1 tak prime numbers count karo

6. return count

------------------------------------------------
Time Complexity: O(n log log n)

Space Complexity: O(n)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public int countPrimes(int n) {

        if (n <= 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];

        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p < n; p++) {

            if (isPrime[p]) {

                for (int i = p * p; i < n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}
