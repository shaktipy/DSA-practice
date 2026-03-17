/*
Problem: Find the Highest Altitude
Platform: LeetCode
Problem No: 1732
Difficulty: Easy

------------------------------------------------
Problem Understanding:
------------------------------------------------
Biker point 0 se start karta hai
jiska altitude = 0 hai.

gain[i] batata hai ki
point i → i+1 pe altitude me kitna change hua.

Hume highest altitude find karna hai
poore trip ke dauran.

------------------------------------------------
Example:
------------------------------------------------
gain = [-5,1,5,0,-7]

Altitude sequence:
Start = 0

0 + (-5) = -5
-5 + 1 = -4
-4 + 5 = 1
1 + 0 = 1
1 + (-7) = -6

Altitudes:
[0, -5, -4, 1, 1, -6]

Max = 1

------------------------------------------------
Approach (Prefix Sum):
------------------------------------------------
1. curr = 0 (starting altitude)
2. max = 0

3. Har step pe:
      curr += gain[i]
      max = max(max, curr)

4. max return karo

------------------------------------------------
Time Complexity:
O(n)

Space Complexity:
O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public int largestAltitude(int[] gain) {

        int curr = 0;
        int max = 0;

        for (int i = 0; i < gain.length; i++) {

            curr += gain[i];

            max = Math.max(max, curr);
        }

        return max;
    }
}
