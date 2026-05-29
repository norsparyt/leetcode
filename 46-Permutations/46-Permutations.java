// Last updated: 30/05/2026, 00:06:50
class Solution {
    // static List<List<Integer>> res;

    public List<List<Integer>> permute(int[] nums) {
    //     res = new ArrayList<>(); //always do these in online platforms
    //     List<Integer> a = new ArrayList<>();
    //     List<Integer> q = new ArrayList<>();
    //     for (int i = 0; i < nums.length; i++)
    //         q.add(nums[i]);
    //     allCombinations(q,a);
    //     return res;
    // }

    // static void allCombinations(List<Integer> q, List<Integer> a) {
    //     if (q.isEmpty()) {
    //         res.add(new ArrayList<>(a)); //mind adding copy of array or it keep referencing changing a
    //         return;
    //     }
    //     for (int i = 0; i < q.size(); i++) {
    //         a.add(q.get(i));
    //         List<Integer> nq = new ArrayList<>(q);//can be optimised using in place swapping?
    //         nq.remove(i);
    //         allCombinations(nq,a);
    //         a.removeLast();//backtracking
    //     }
    // }
    
    
    List<List<Integer>> res = new ArrayList<>();
    boolean[] used = new boolean[nums.length];
    List<Integer> curr = new ArrayList<>();
    backtracking(nums,curr,used,res);
    return res;
    }

    void backtracking(int[] nums, List<Integer> curr, boolean[] used, List<List<Integer>> res){
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
        }
        for(int i=0;i<nums.length;i++){
            if(!used[i]){
                //choose
                curr.add(nums[i]);
                used[i]=true;
                //explore
                backtracking(nums,curr,used,res);
                //backtrack
                curr.removeLast();
                used[i]=false;
            }
        }
    }
    }