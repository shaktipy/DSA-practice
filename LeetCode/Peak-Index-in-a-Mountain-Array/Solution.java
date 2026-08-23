1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        int low=0;
4        int high=arr.length-1;
5        while(low<high){
6            int mid=low+(high-low)/2;
7            if(arr[mid]>arr[mid+1]){
8                high=mid;
9            } else{
10                low=mid+1;
11            }
12        }
13        return low;
14    }
15}