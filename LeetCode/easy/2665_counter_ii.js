/*
Problem: Counter II
Platform: LeetCode
Difficulty: Easy
Topics: Closures, JavaScript Functions

----------------------------------
Problem Statement:
----------------------------------
Write a function createCounter that accepts an initial integer init
and returns an object with three functions:

- increment(): increases current value by 1 and returns it
- decrement(): decreases current value by 1 and returns it
- reset(): resets the value to init and returns it

----------------------------------
Approach:
----------------------------------
- Use JavaScript closure to store the current value.
- Store init separately for reset operation.
- Each function updates and returns the value.

----------------------------------
Time Complexity: O(1) per operation
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

/**
 * @param {number} init
 * @return {{increment: Function, decrement: Function, reset: Function}}
 */
var createCounter = function(init) {
    let current = init;

    return {
        increment: function() {
            current++;
            return current;
        },
        decrement: function() {
            current--;
            return current;
        },
        reset: function() {
            current = init;
            return current;
        }
    };
};
