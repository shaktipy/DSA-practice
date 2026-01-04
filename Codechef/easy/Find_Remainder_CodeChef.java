/*
Problem: Find Remainder
Platform: CodeChef
Difficulty: Easy
Topics: Math, Operators
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Write a program to find the remainder when an integer A
is divided by an integer B.

Input:
- First line contains integer T (number of test cases)
- Next T lines each contain two integers A and B

Output:
- For each test case, print the remainder (A % B)

----------------------------------
Approach / Explanation:
----------------------------------
1. Read number of test cases T.
2. For each test case:
   - Read integers A and B.
   - Compute remainder using modulo operator (%).
3. Print the result for each test case.

----------------------------------
Time Complexity:
----------------------------------
O(T)

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
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A % B);
        }

        sc.close();
	}
}
