/*
Problem: Happy Number
Platform: LeetCode
Difficulty: Easy
Topics: Math, Two Pointers
Problem No: 202

------------------------------------------------
Approach (Without HashTable):
------------------------------------------------
We use Floyd’s Cycle Detection Algorithm.

1. Define a function to compute sum of squares of digits.
2. Use two pointers:
   - slow → moves one step at a time
   - fast → moves two steps at a time
3. If number is happy, fast pointer will reach 1.
4. If there's a cycle not including 1, slow and fast will meet.

------------------------------------------------
Time Complexity: O(log n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = getNext(slow);           
            fast = getNext(getNext(fast)); 
        } while (slow != fast);

        return slow == 1;
    }
}
