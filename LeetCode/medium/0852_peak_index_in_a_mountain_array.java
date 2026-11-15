/*
Problem: Peak Index in a Mountain Array
Platform: LeetCode
Difficulty: Medium
Problem No: 852

------------------------------------------------
Problem Statement:
------------------------------------------------
 * # Peak Index in a Mountain Array
 *
 * Can you solve this real interview question? Peak Index in a Mountain Array - You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
 *
 * Return the index of the peak element.
 *
 * Your task is to solve it in O(log(n)) time complexity.
 *
 *  
 *
 * Example 1:
 *
 * Input: arr = [0,1,0]
 *
 * Output: 1
 *
 * Example 2:
 *
 * Input: arr = [0,2,1,0]
 *
 * Output: 1
 *
 * Example 3:
 *
 * Input: arr = [0,10,5,2]
 *
 * Output: 1

------------------------------------------------
Solution:
------------------------------------------------
*/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid+1]){
                high=mid;
            } else{
                low=mid+1;
            }
        }
        return low;
    }
}