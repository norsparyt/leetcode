// Last updated: 30/05/2026, 00:04:00
class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int min=position[0],max=position[position.length-1];
        // GREEDY APPROACH BUT LINEAR SO : TLE
        // int pos;
        // int count;
        // for(int j=max-min; j>=1;j--){
        //     count=m-1;
        //     pos=0;
        //     System.out.println("j"+j);
        //     for(int i=1; i<position.length;i++){
        //         if((position[i]-position[pos])>=j){
        //             pos=i;
        //             System.out.println("placed at "+pos);
        //             count--;
        //         }
        //         if(count==0){
        //             return j;
        //         }
        //     }
        // }
        // return 1;
        
        //SAME APPROACH BUT BINARY
        int l=1, r=max-min;int middle;
        int pos; int ans=0;
        int count;
        while(l<=r){
            count=m-1;
            pos=0;
            middle=l+(r-l)/2;
            for(int i=1; i<position.length;i++){
                if((position[i]-position[pos])>=middle){
                    pos=i;
                    count--;
                }if(count==0) break;
            }
            if(count==0){
                ans=middle;
                l=middle+1;
            }
            else r=middle-1;
        }
        return ans;
    }
}