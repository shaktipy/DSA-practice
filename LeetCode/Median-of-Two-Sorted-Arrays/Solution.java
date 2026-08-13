1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int x = nums1.length; int y = nums2.length;
4        int arr[] = new int[x+y];
5        for(int i=0; i<x; i++){
6            arr[i]=nums1[i];
7        }
8        for(int i=0; i<y;i++){
9            arr[i+x]=nums2[i];
10        }
11        Arrays.sort(arr);
12        int n = arr.length;
13        if(n%2==0){
14            return (arr[n/2 - 1]+arr[n/2])/2.0;
15        } else{
16            return arr[n/2];
17        }
18    }
19}