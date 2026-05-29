// Last updated: 30/05/2026, 00:06:02
class Solution {
    public int singleNumber(int[] nums) {
        // HashMap<Integer, Integer> people = new HashMap<>();
        //         int count;
        //         for(int num: nums){
        //             if(people.containsKey(num)) 
        //                 {
        //                     count=people.get(num);
        //                     people.put(num,++count);
        //                 }
        //             else people.put(num,1);
        //         }
        //         for(Map.Entry<Integer, Integer> e : people.entrySet()){
        //             if(e.getValue()==1) return e.getKey();
        //         }
        //         return -1;
        //USES O(N) EXTRA SPACE
        int count;
        int res=0;
        for(int j=0;j<32;j++){
            count=0;
        for(int i=0;i<nums.length;i++){
            // int bit=nums[i]&1;
            // nums[i]=nums[i]>>1; //DESTROYS ORIGINAL ARRAY-NOT RECOMMENDED
            int bit=(nums[i]>>j)&1;
            count+=bit;
        }
        if(count%3==1) 
            res=res|(1<<j);
    }
    return res;
    }
}