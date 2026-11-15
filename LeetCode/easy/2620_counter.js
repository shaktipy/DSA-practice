/*
Problem: Counter
Platform: LeetCode
Difficulty: Easy
Problem No: 2620

------------------------------------------------
Problem Statement:
------------------------------------------------
Given an integer n, return a counter function.

The counter function initially returns n. Each time it is called afterward,
it returns one more than its previous value.

Example 1:
Input: n = 10
Calls: ["call", "call", "call"]
Output: [10, 11, 12]

Explanation:
- The first call returns 10.
- The second call returns 11.
- The third call returns 12.

Example 2:
Input: n = -2
Calls: ["call", "call", "call", "call", "call"]
Output: [-2, -1, 0, 1, 2]

Constraints:
- -1000 <= n <= 1000
- 0 <= calls.length <= 1000
- calls[i] is "call".

------------------------------------------------
Solution:
------------------------------------------------
*/

/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    
    return function() {
        return n++;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */
