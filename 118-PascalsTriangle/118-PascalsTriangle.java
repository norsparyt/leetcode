// Last updated: 30/05/2026, 00:06:13
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<>(numRows);
        for(int i=0;i<numRows;i++){
            List<Integer> ithList=new ArrayList<>(i+1);           
            for(int j=0;j<i+1;j++){
                if(j==0||j==i)
                    ithList.add(1);                    
                else
                    ithList.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
            }
            triangle.add(ithList);
        }
        return triangle;
    }
}