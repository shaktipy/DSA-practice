/*
Problem: Count Partitions with Even Sum Difference
Platform: LeetCode
Problem No: 3432
Difficulty: Easy

------------------------------------------------
Observation:
------------------------------------------------
(left - right) even hone ka matlab:

(left - right) % 2 == 0

=> (left % 2 == right % 2)

=> Total sum bhi important ho jata hai

------------------------------------------------
Key Insight:
------------------------------------------------
Let total = sum of array

Right = total - left

So:
(left - (total - left)) = 2*left - total

Even hone ke liye:
2*left - total even hona chahiye

2*left hamesha even hota hai

=> total bhi even hona chahiye

------------------------------------------------
Conclusion:
------------------------------------------------
- Agar total sum EVEN hai → saare partitions valid
- Agar total sum ODD hai → koi bhi valid nahi

------------------------------------------------
Algorithm:
------------------------------------------------
1. total sum nikaalo
2. Agar total % 2 != 0 → return 0
3. Warna return n - 1

------------------------------------------------
Time Complexity: O(n)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            int left = 0;
            int right = 0;
        for (int j = 0; j <= i; j++) {
            left += nums[j];
        }
        for (int j = i + 1 ; j < n; j++) {
            right += nums[j];
        }
        if ((left - right) % 2 == 0) {
            count++;
        }
    }
        return count;
    }
}
