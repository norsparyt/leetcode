// Last updated: 30/05/2026, 00:06:05
class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int[] leftCandy= new int[n];
        int[] rightCandy= new int[n];
        for(int i=0; i<n; i++){
            leftCandy[i]=1;
            rightCandy[i]=1;
        }
        for(int i=1; i<n; i++){
            if(ratings[i]>ratings[i-1])
            leftCandy[i]=leftCandy[i-1]+1;
        }
        for(int i=n-2; i>=0; i--){
            if(ratings[i]>ratings[i+1])
            rightCandy[i]=rightCandy[i+1]+1;
        }
        int total=0;
        for(int i=0; i<n; i++){
            total+=Math.max(leftCandy[i],rightCandy[i]);
        }
        return total;
    }
}