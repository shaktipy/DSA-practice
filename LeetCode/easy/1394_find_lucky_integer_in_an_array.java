/*
Problem: Find Lucky Integer in an Array
Platform: LeetCode
Problem No: 1394
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Lucky integer woh hota hai jiska frequency
  uski value ke equal ho
- Pehle array ko sort karenge
- End se start ki taraf traverse karenge
  taaki largest lucky integer pehle mile
- Har unique number ka frequency count karenge
- Agar frequency == value → return value

------------------------------------------------
Algorithm:
------------------------------------------------
1. Array ko sort karo
2. n = arr.length
3. i = n - 1 se 0 tak loop
      - currentValue = arr[i]
      - cnt = 0
      - j = i
      - Jab tak arr[j] == currentValue:
            cnt++
            j--
      - Agar cnt == currentValue → return currentValue
      - i = j + 1
4. Agar kuch na mile → return -1

------------------------------------------------
Time Complexity: O(n log n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int findLucky(int[] arr) {

        Arrays.sort(arr);
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {

            int currentvalue = arr[i];
            int cnt = 0;
            int j = i;

            while (j >= 0 && arr[j] == currentvalue) {
                cnt++;
                j--;
            }

            if (cnt == currentvalue) {
                return currentvalue;
            }

            i = j + 1;
        }

        return -1;
    }
}
