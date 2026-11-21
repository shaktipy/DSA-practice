class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n = rain.length;
        String[] ans = new String[n];
        int c1=0;
        int c2=0;
        for(int i=0;i<n;i++){
            boolean alice = i+1<n && rain[i] == 1 && rain[i+1] == 1;
            boolean bob = rain[i] == 1;
            if(alice && bob){
                if(c1 <= c2){
                    ans[i] = "Alice";
                    c1++;
                }else{
                    ans[i] = "Bob";
                    c2++;
                }
            }else if(alice){
                ans[i]="Alice";
                c1++;
            }else if(bob){
                ans[i]="Bob";
                c2++;
            }else{
                ans[i]="None";
            }
        }
        return ans;
    }
}