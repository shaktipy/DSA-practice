/*
Problem: Jewels and Stones
Platform: LeetCode
Problem No: 771
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Hume count karna hai ki stones string me
  kitne characters jewels string me present hain.

- jewels string batati hai kaun se characters
  jewels hain.

- stones string batati hai hamare paas
  kaun se stones hain.

Example:
jewels = "aA"
stones = "aAAbbbb"

Stones:
a  → jewel
A  → jewel
A  → jewel
b  → not jewel
b  → not jewel
b  → not jewel
b  → not jewel

Total jewels = 3

- Idea:
  Stones string ko traverse karenge
  aur check karenge ki current character
  jewels string me exist karta hai ya nahi.

- Agar exist karta hai
      count++

------------------------------------------------
Algorithm:
------------------------------------------------
1. count = 0

2. i = 0 se stones.length - 1 tak loop chalao

3. Agar jewels.indexOf(stones.charAt(i)) != -1
      count++

4. Loop ke baad count return karo

------------------------------------------------
Time Complexity: O(n * m)

Where:
n = stones length
m = jewels length

Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public int numJewelsInStones(String jewels, String stones) {

        int count = 0;

        for (int i = 0; i < stones.length(); i++) {

            if (jewels.indexOf(stones.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }
}
