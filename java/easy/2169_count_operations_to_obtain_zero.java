/*
Problem: Count Operations to Obtain Zero
Platform: LeetCode
Problem No: 2169
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Hume count karna hai ki kitni operations
  me num1 ya num2 zero ban jayega.

- Har operation me:
      Agar num1 >= num2
            num1 = num1 - num2
      warna
            num2 = num2 - num1

- Har subtraction ko ek operation count karenge.

- Process tab tak chalega jab tak
  num1 == 0 ya num2 == 0 na ho jaye.

------------------------------------------------
Algorithm:
------------------------------------------------
1. operations = 0

2. Jab tak num1 != 0 AND num2 != 0:
      - Agar num1 >= num2
            num1 -= num2
      - warna
            num2 -= num1
      - operations++

3. return operations

------------------------------------------------
Time Complexity: O(max(num1, num2))

Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public int countOperations(int num1, int num2) {

        int operations = 0;

        while (num1 != 0 && num2 != 0) {

            if (num1 >= num2) {
                num1 -= num2;
            } 
            else {
                num2 -= num1;
            }

            operations++;
        }

        return operations;
    }
}
