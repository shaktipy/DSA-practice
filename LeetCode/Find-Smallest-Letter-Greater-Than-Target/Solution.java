1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        int low =0;
4        int high = letters.length-1;
5        int ans = letters.length;
6        while(low<=high){
7            int mid = low+(high-low)/2;
8            if(letters[mid]>target){
9                ans = mid;
10                high = mid -1;
11            } else{
12                low = mid+1;
13            }
14        }
15        return letters[ans % letters.length];
16    }
17}