/*
Problem: Convert the Temperature
Platform: LeetCode
Problem No: 2469
Difficulty: Easy

------------------------------------------------
Problem Understanding:
------------------------------------------------
- Celsius temperature diya hai
- Usko convert karna hai:
    1. Kelvin
    2. Fahrenheit

Formulas:
Kelvin = Celsius + 273.15
Fahrenheit = Celsius * 1.80 + 32.00

------------------------------------------------
Approach:
------------------------------------------------
- Direct formula apply karenge
- Kelvin aur Fahrenheit calculate karenge
- Dono values ko array me store karke return karenge

------------------------------------------------
Algorithm:
------------------------------------------------
1. kelvin = celsius + 273.15
2. fahren = celsius * 1.80 + 32.00
3. Ek array banao size 2 ka
4. arr[0] = kelvin
5. arr[1] = fahren
6. Return arr

------------------------------------------------
Time Complexity: O(1)
Space Complexity: O(1)

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {

    public double[] convertTemperature(double celsius) {

        double kelvin = 0;
        double fahren = 0;

        kelvin = celsius + 273.15;
        fahren = celsius * 1.80 + 32.00;

        double arr[] = new double[2];

        arr[0] = kelvin;
        arr[1] = fahren;

        return arr;
    }
}
