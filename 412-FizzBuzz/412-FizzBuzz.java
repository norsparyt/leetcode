// Last updated: 30/05/2026, 00:05:09
class Solution {
    public List<String> fizzBuzz(int n) {
        // int[] fb=new int[n];
        List<String> fb=new ArrayList<String>(n);
        for(int i=1;i<=n;i++){
            boolean mod3=(i%3==0);
            boolean mod5=(i%5==0);
            if(mod3 && mod5) fb.add("FizzBuzz");
            else if(mod3) fb.add("Fizz");
            else if(mod5) fb.add("Buzz");
            else fb.add(i+"");
        }
        return fb;
    }
}