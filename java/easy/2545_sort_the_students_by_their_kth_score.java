/*
Problem: Sort the Students by Their Kth Score
Platform: LeetCode
Problem No: 2545
Difficulty: Medium

------------------------------------------------
Problem Understanding:
------------------------------------------------
- score matrix diya hai jisme:
  score[i][j] = ith student ka jth exam score
- Hume students (rows) ko sort karna hai
- Sorting kth column ke basis pe hogi
- Order: descending (highest score pehle)

------------------------------------------------
Approach (Brute - Selection Sort Style):
------------------------------------------------
- Har row ko compare karenge baaki rows se
- Agar kisi student ka kth score dusre se kam hai
  to swap kar denge
- Isse highest score wala row upar aa jayega
- Step by step pura matrix sort ho jayega

------------------------------------------------
Algorithm:
------------------------------------------------
1. Loop i = 0 to n-1
2. Loop j = i+1 to n
3. Agar score[i][k] < score[j][k]:
      swap(score[i], score[j])
4. Return sorted matrix

------------------------------------------------
Time Complexity: O(n^2)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public int[][] sortTheStudents(int[][] score, int k) {

        int n = score.length;

        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {

                if(score[i][k] < score[j][k]) {

                    int[] temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
        }

        return score;
    }
}
