/*
Problem: Favourite Numbers
Platform: CodeChef
Difficulty: Easy
Topics: Conditional Statements, Math

----------------------------------
Problem Statement:
----------------------------------
Alice likes numbers which are:
- Even
- Multiple of 7

Bob likes numbers which are:
- Odd
- Multiple of 9

If Alice likes the number, Alice takes it.
Else if Bob likes the number, Bob takes it.
Else Charlie takes it.

----------------------------------
Approach:
----------------------------------
For a given number A:
- If A is even and divisible by 7 → Alice
- Else if A is odd and divisible by 9 → Bob
- Else → Charlie

----------------------------------
Time Complexity: O(1) per test case
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            // Your code goes here
            if (a % 2 == 0 && a % 7 == 0) {
    System.out.println("Alice");
} else if (a % 2 != 0 && a % 9 == 0) {
    System.out.println("Bob");
} else {
    System.out.println("Charlie");
}
        }
    }
}

