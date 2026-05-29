// Last updated: 30/05/2026, 00:07:03
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE&&divisor==-1) 
            return Integer.MAX_VALUE;
        int sign=((dividend<0)^(divisor<0))?-1:1;
        int q=0;
        long div=Math.abs((long)divisor);// not using long inside doesnt work
        long did=Math.abs((long)dividend);//becuase int still overflows
        //gfg solution in one single loop
        // for(int i=31;i>=0;i--){//reverse because we remove big chunks first
        //     System.out.println(q);
        //     if((div<<i)<=did)
        //     {
        //         did=did-(div<<i);
        //         q=q+(1<<i); //can also do q|=(1L<<i) 1L means 1 in long
        //     }
        // }
        //gpt solution using 2 loops
        while(did>=div){
            long temp=div;
            int multiple=1;
            while((temp<<1)<=did)
            {
                temp=temp<<1;
                multiple=multiple<<1;
            }
            q=q+multiple;
            did=did-temp;
        }
        return q*sign;
    }
}