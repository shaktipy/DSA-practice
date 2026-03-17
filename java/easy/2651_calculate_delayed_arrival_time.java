/*
Problem: Calculate Delayed Arrival Time
Platform: LeetCode
Problem No: 2651
Difficulty: Easy

------------------------------------------------
Problem Understanding:
------------------------------------------------
Train ka arrival time diya hai (24-hour format me)
Aur delay diya hai hours me.

Hume final arrival time return karna hai.

Note:
Time 24-hour format me hai,
toh 24 ke baad fir 0 se start hota hai.

------------------------------------------------
Key Idea:
------------------------------------------------
Ye pura problem modulo (%) pe based hai.

Final time = (arrivalTime + delayedTime) % 24

------------------------------------------------
Example:
------------------------------------------------
arrivalTime = 13
delayedTime = 11

13 + 11 = 24

24 % 24 = 0

------------------------------------------------
arrivalTime = 15
delayedTime = 5

15 + 5 = 20

20 % 24 = 20

------------------------------------------------
Time Complexity:
O(1)

Space Complexity:
O(1)

------------------------------------------------
Optimized Solution:
------------------------------------------------
*/

class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int sum = arrivalTime + delayedTime;
        if (sum < 24){ 
            return sum;
        }
        else if(sum==24){
        return 0;
        } 
        else {
        return sum - 24;
        }
    }
}
