// Last updated: 30/05/2026, 00:06:25
class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        subsets(nums,new ArrayList<>(),res,0);
        return res;
    }
    void subsets(int[] nums,List<Integer> curr,List<List<Integer>> res,int index){
        res.add(new ArrayList<>(curr));
        for(int i=index;i<nums.length;i++){
            //choose
            curr.add(nums[i]);
            //explore
            subsets(nums,curr,res,i+1);
            //backtrack
            curr.remove(curr.size()-1);
            //all of this works because lists are objects and their references are not modified
            //changes persist over functions
        }
    }
}