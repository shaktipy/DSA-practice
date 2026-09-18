1class Solution {
2    public boolean isPalindrome(int x) {
3        int rev=0;
4        int original=x;
5        if(x<0){
6            return false;
7        }
8        while(x!=0){
9            int ld=x%10;
10            rev = rev*10 + ld;
11            x/=10;
12            
13        }
14        return original == rev;
15    }
16}