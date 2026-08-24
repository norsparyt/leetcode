// Last updated: 25/08/2026, 00:25:21
// HashSet.
1class Solution {
2    public int distributeCandies(int[] candyType) {
3        Set<Integer> types = new HashSet<>();
4        for(int c: candyType){
5            types.add(c);
6        }
7        return Math.min(candyType.length/2, types.size());
8    }
9}