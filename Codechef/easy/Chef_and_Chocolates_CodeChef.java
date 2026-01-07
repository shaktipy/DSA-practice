/*
Problem: Chef and Chocolates
Platform: CodeChef
Difficulty: Easy
Topics: Math, Greedy

----------------------------------
Problem Statement:
----------------------------------
Chef has:
- X coins of 5 rupees
- Y coins of 10 rupees

Each chocolate costs Z rupees.

Find the maximum number of chocolates Chef can buy.

----------------------------------
Approach:
----------------------------------
1. Total money Chef has =
   (X * 5) + (Y * 10)
2. Maximum chocolates =
   totalMoney / Z

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
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            // Your code goes here
            int totalMoney = (x * 5) + (y * 10);
            System.out.println(totalMoney / z);
        }

        scanner.close();
    }
}

