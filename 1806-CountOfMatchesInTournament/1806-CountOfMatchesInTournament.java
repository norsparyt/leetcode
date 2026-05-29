// Last updated: 30/05/2026, 00:03:54
class Solution {
    public int numberOfMatches(int n) {
        int matches=0;
        while(n>1){
            if(n%2==0){
                //even
                matches+=n/2;
                n=n/2;
            }
            else{
                //odd
                matches+=(n-1)/2;
                n=((n-1)/2) +1;
            }
        }
        return matches;
    }
}