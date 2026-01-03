/*
Problem: Capitalize the Title
Problem No: 2129
Platform: LeetCode
Difficulty: Easy
Topics: String
Contest: Biweekly Contest 69
Language: Java

----------------------------------
Problem Statement:
----------------------------------
Given a string title consisting of one or more words separated by spaces,
capitalize the title as follows:

- Words of length 1 or 2 should be converted to lowercase.
- Words of length 3 or more should have the first letter capitalized
  and the remaining letters in lowercase.

Return the correctly capitalized title.

----------------------------------
Approach / Explanation:
----------------------------------
1. Split the title string by spaces into words.
2. For each word:
   - If length < 3 → convert entire word to lowercase.
   - Else → capitalize first character and lowercase the rest.
3. Join all words back with a single space.
4. Return the result string.

----------------------------------
Tech Used:
----------------------------------
- Java
- String manipulation

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();

            if (word.length() >= 3) {
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            }

            result.append(word);
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
