/*
Problem: Chef and Happy String
Platform: CodeChef
Difficulty: Easy
Topic: Strings

----------------------------------
Problem Statement:
----------------------------------
Chef is happy if the string contains
a contiguous substring of length > 2
where all characters are vowels.

----------------------------------
Approach:
----------------------------------
Traverse the string and count
continuous vowels.
If count exceeds 2, print HAPPY.

----------------------------------
Time Complexity: O(N)
Space Complexity: O(1)
----------------------------------
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();

            // Your code goes here
  
            int count = 0;
            boolean happy = false;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (isVowel(ch)) {
                    count++;
                    if (count > 2) {
                        happy = true;
                        break;
                    }
                } else {
                    count = 0;
                }
            }

            if (happy) {
                System.out.println("HAPPY");
            } else {
                System.out.println("SAD");
            }
        }
        scanner.close();
    }

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u';
    }
