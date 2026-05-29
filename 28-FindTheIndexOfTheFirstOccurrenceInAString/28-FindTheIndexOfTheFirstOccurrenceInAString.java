// Last updated: 30/05/2026, 00:07:04
class Solution {
    public int strStr(String haystack, String needle) {
        int index=-1;
        // boolean found=true;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                index=i;
                System.out.println("index ="+index);
                for(int j=1;j<=needle.length();j++){
                    if(j==needle.length()) return index;
                    if(haystack.charAt(j+i)!=needle.charAt(j)){
                        System.out.println(haystack.charAt(j+i)+" is not "+ needle.charAt(j)+"at"+i);
                        index=-1;
                        // found=false;
                        break;
                    }
                }
                // if(found) return index;      
                }
            }
            return index;
    }
}