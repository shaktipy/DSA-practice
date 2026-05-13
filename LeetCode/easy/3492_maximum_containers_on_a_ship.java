/*
Problem: Maximum Containers on a Ship
Platform: LeetCode
Problem No: 3492
Difficulty: Easy

------------------------------------------------
Problem Understanding:
------------------------------------------------
Ship ka deck size = n × n

Total cells = n²

Har cell me ek container rakh sakte hain
Aur har container ka weight = w

Lekin ship ka maximum allowed weight = maxWeight

Hume maximum containers find karne hain
jo weight limit cross na kare.

------------------------------------------------
Key Idea:
------------------------------------------------
Total containers possible due to deck:
n²

Total containers possible due to weight:
maxWeight / w

Actual containers = minimum of both

Answer:
min(n², maxWeight / w)

------------------------------------------------
Example 1:
------------------------------------------------
n = 2
w = 3
maxWeight = 15

Deck capacity = 2 × 2 = 4

Weight capacity = 15 / 3 = 5

Answer = min(4,5) = 4

------------------------------------------------
Example 2:
------------------------------------------------
n = 3
w = 5
maxWeight = 20

Deck capacity = 9

Weight capacity = 20 / 5 = 4

Answer = min(9,4) = 4

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

    public int maxContainers(int n, int w, int maxWeight) {

        int deckCapacity = n * n;

        int weightCapacity = maxWeight / w;

        return Math.min(deckCapacity, weightCapacity);
    }
}
