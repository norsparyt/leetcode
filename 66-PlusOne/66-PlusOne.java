// Last updated: 30/05/2026, 00:06:35
class Solution {
    public int[] plusOne(int[] digits) {

        digits[digits.length-1]=digits[digits.length-1]+1;
        if(digits[digits.length-1]<=9) return digits;

        for(int i=digits.length-1;i>0;i--)
        {
            if(digits[i]>9){
                digits[i]=digits[i]-10;
                digits[i-1]=digits[i-1]+1;
            }
            else{
                break;
            }
        }
        if(digits[0]==10){
        int[] result=new int[digits.length+1];
        for(int i=1;i<digits.length;i++){result[i]=digits[i];}
        result[0]=1;
        result[1]=0;
        return result;
        }
        return digits;
    }
}