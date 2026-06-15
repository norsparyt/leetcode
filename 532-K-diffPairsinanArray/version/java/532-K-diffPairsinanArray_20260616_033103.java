// Last updated: 16/06/2026, 03:31:03
/*
 * Right Intuition: HashMaps.
 * Caveats:
 * traversing the map instead of array to avoid dups
 * storing frequencies of a special case of k==0
*/

1class Solution {
2    public int findPairs(int[] nums, int k) {
3        int count=0;
4        Map<Integer,Integer> map= new HashMap<>();
5        for (int num : nums) {
6            map.put(num, map.getOrDefault(num, 0) + 1);
7        }
8        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
9            if(k!=0 && map.containsKey(entry.getKey()+k))
10                count++;
11            if(k==0 && entry.getValue()>=2)
12                count++;
13        }
14        return count;
15    }
16}