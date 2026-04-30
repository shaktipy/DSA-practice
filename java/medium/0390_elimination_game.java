/*
Problem: Elimination Game
Platform: LeetCode
Problem No: 390
Difficulty: Medium
Topics: Math, Recursion

------------------------------------------------
Approach:
------------------------------------------------
- Direct simulation costly hai → pattern observe karte hain
- Har round me:
      → numbers half ho jaate hain
      → step double ho jata hai
- Head maintain karte hain (current first element)
- Rules:
      → Left to Right: head always move karega
      → Right to Left:
            - Agar remaining odd hai → head move karega
            - warna same rahega

------------------------------------------------
Algorithm:
------------------------------------------------
1. head = 1, step = 1, remaining = n, left = true
2. Jab tak remaining > 1:
      - Agar left == true ya remaining odd hai:
            head += step
      - step *= 2
      - remaining /= 2
      - left = !left
3. Return head

------------------------------------------------
Time Complexity: O(log n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int lastRemaining(int n) {
        int head = 1;
        int step = 1;
        int remaining = n;
        boolean left = true;

        while (remaining > 1) {
            if (left || remaining % 2 == 1) {
                head = head + step;
            }
            
            step = step * 2;
            remaining = remaining / 2;
            left = !left;
        }

        return head;
    }
}
