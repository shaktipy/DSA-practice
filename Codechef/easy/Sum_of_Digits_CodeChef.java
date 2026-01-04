/*
Problem: Sum of Digits
Platform: CodeChef
Difficulty: Easy
Topics: Math, Loops
Language: Java

----------------------------------
Problem Statement:
----------------------------------
You're given an integer N.
Calculate the sum of all the digits of N.

Input:
- First line contains integer T (number of test cases)
- Next T lines each contain an integer N

Output:
- For each test case, print the sum of digits of N

----------------------------------
Approach / Explanation:
----------------------------------
1. For each test case, take the number N.
2. Extract digits using modulo (% 10).
3. Add each digit to sum.
4. Remove last digit using division (/ 10).
5. Print the sum.

----------------------------------
Time Complexity:
----------------------------------
O(d) per test case, where d = number of digits

----------------------------------
Space Complexity:
----------------------------------
O(1)

----------------------------------
Solution:
----------------------------------
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int sum = 0;

            while (n > 0) {
                sum += n % 10;
                n = n / 10;
            }

            System.out.println(sum);
        }

        sc.close();
	}
}
