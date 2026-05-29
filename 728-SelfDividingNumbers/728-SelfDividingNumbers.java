// Last updated: 30/05/2026, 00:04:44
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=left;i<=right;i++){
            if(selfDividing(i)) list.add(i);
        }
        return list;
    }
    boolean selfDividing(int i){
        int num=i;
        while(num!=0){
            int r=num%10;
            if(r==0 || i%r!=0) return false;
            num=num/10;
        }
        return true;
    }
}