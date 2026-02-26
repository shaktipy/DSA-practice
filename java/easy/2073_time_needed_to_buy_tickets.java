/*
Problem: Time Needed to Buy Tickets
Platform: LeetCode
Problem No: 2073
Difficulty: Easy

------------------------------------------------
Approach:
------------------------------------------------
- Queue simulation karenge
- Jab tak kth person ke tickets khatam nahi hote
  tab tak process continue hoga
- Har round me:
    - Har person agar tickets[i] > 0 hai
      to ek ticket kharidega (1 second lagega)
- Jaise hi tickets[k] == 0 hoga
  hum loop break kar denge

------------------------------------------------
Algorithm:
------------------------------------------------
1. time = 0
2. Jab tak tickets[k] > 0:
      - i = 0 se n-1 tak loop
            - Agar tickets[i] > 0:
                  tickets[i]--
                  time++
            - Agar tickets[k] == 0:
                  break
3. Return time

------------------------------------------------
Time Complexity: O(n * tickets[k])
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        int time = 0;

        while (tickets[k] > 0) {

            for (int i = 0; i < tickets.length; i++) {

                if (tickets[i] > 0) {
                    tickets[i]--;
                    time++;
                }

                if (tickets[k] == 0) {
                    break;
                }
            }
        }

        return time;
    }
}
