// Last updated: 30/05/2026, 00:03:45
class Solution {
    public int findGCD(int[] nums) {
        int largest=Integer.MIN_VALUE, smallest=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(largest<nums[i])
                {largest=nums[i];}
            if(smallest>nums[i])
                {smallest=nums[i];}
        }
        System.out.println(smallest);
        System.out.println(largest);
        int divisor=smallest;
        int dividend=largest;
        int rem=dividend%divisor;
        int temp=dividend/divisor;
        while(rem>0){
            System.out.println(divisor);
            dividend=divisor;
            divisor=rem;
            rem=dividend%divisor;
            temp=dividend/divisor;
        }
        return divisor;
    }
}