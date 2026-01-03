/*
Problem: Find Maximum in an Array
Platform: CodeChef
Difficulty: Easy
Topics: Array, Iteration
Language: Java

----------------------------------
Problem Statement:
----------------------------------
You are given heights of N mountains.
Your task is to find the height of the tallest mountain.

For multiple test cases, output the maximum height for each test case.

----------------------------------
Approach / Explanation:
----------------------------------
1. Initialize a variable maxHeight with the minimum possible value.
2. Traverse the array of mountain heights.
3. Update maxHeight whenever a larger value is found.
4. Print maxHeight for each test case.

----------------------------------
Tech Used:
----------------------------------
- Java
- Arrays
- Loops

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

        int T = sc.nextInt(); // number of test cases

        while (T-- > 0) {
            int N = sc.nextInt(); // number of mountains
            long maxHeight = 0;

            for (int i = 0; i < N; i++) {
                long height = sc.nextLong();
                if (height > maxHeight) {
                    maxHeight = height;
                }
            }

            System.out.println(maxHeight);
        }

        sc.close();
	}
}
;
