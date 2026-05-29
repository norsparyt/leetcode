// Last updated: 30/05/2026, 00:05:15
class Solution {
    public int[] singleNumber(int[] nums) {
        // HashMap<Integer, Integer> people = new HashMap<>();
        // int count;
        // for(int num: nums){
        //     if(people.containsKey(num)) 
        //         {
        //             count=people.get(num);
        //             people.put(num,++count);
        //         }
        //     else people.put(num,1);
        // }
        // int[] res=new int[2];
        // int counter=0;
        // for(Map.Entry<Integer, Integer> e : people.entrySet()){
        //     if(e.getValue()==1) {
        //         res[counter]=e.getKey();
        //         counter++;
        //         }
        // }
        // return res;
        //USES O(N) EXTRA SPACE

        //MASK USING RIGHTMOST SET BIT
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }
        int mask = xor & (-xor); //has rightmost bit set
        int group1 = 0;
        int group2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((mask & nums[i]) == mask) 
                group1 ^= nums[i];
            else
                group2 ^= nums[i];
        }
        
        return new int[] { group1, group2 };
    }
}