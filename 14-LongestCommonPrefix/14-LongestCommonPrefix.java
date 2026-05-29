// Last updated: 30/05/2026, 00:07:16
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result= "";
        boolean flag=false;
        for(int k=0;k<strs[0].length();k++){
            result=result+strs[0].charAt(k);

            for(int i=0;i<strs.length;i++){
                if(!strs[i].startsWith(result)) 
                    flag=true;
                    // break;
            }
            System.out.println("result "+result);  
            if(flag) return result.substring(0,result.length()-1); 
        }
        return result;
    }
    }