/*
Problem: Total Distance Traveled
Platform: LeetCode
Difficulty: Easy
Topics: Simulation
Contest: Weekly Contest 350

----------------------------------
Problem Statement:
----------------------------------
A truck has two fuel tanks:
- mainTank liters
- additionalTank liters

Mileage = 10 km per liter.

Rule:
For every 5 liters consumed from the main tank,
if the additional tank has at least 1 liter,
1 liter is transferred to the main tank instantly.

Return the maximum distance the truck can travel.

----------------------------------
Approach:
----------------------------------
- Every liter gives 10 km.
- For every group of 5 liters used from mainTank:
  - If additionalTank > 0, inject 1 liter into mainTank.
- Number of injections possible:
  min(additionalTank, mainTank / 5)

Total effective fuel =
mainTank + injections

----------------------------------
Time Complexity: O(1)
Space Complexity: O(1)

----------------------------------
Solution:
----------------------------------
*/

class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int totalDistance = 0;
        while (mainTank >= 5) {
            mainTank -= 5;
            totalDistance += 50;
            if (additionalTank >= 1) {
                additionalTank -= 1;
                mainTank += 1;
            }
        }
        totalDistance += mainTank * 10;
        return totalDistance;
    }
}
