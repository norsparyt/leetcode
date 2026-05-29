// Last updated: 30/05/2026, 00:07:09
class Solution {
    public boolean isValid(String s) {
        if(s.length()==1) return false;
        // Stack<Character> st = new Stack<>(s.length());
        // for (int i = 0; i < s.length(); i++) {
        //     char curr=s.charAt(i);
        //     if (curr== '(' || curr == '{' || curr== '[') {
        //         st.push(curr);
        //     } else {
        //         if(st.size()==0) return false;
        //         char ch = st.pop();
        //         if (curr==')'&&ch != '(') return false;
        //         if (curr=='}'&&ch != '{') return false;
        //         if (curr==']'&&ch != '[') return false;
        //     }
        // }
        // if(st.size()!=0) return false;
        // return true;

    //optimal approach using deque

    Deque<Character> st= new ArrayDeque<>();
    Map<Character,Character> map=Map.of(
        ')', '(',
        '}', '{',
        ']', '['
        );
    for (char curr: s.toCharArray()) {
            if (curr== '(' || curr == '{' || curr== '[') {
                st.push(curr);
            } else {
                if(st.isEmpty()||st.pop()!=map.get(curr)) return false;
            }
        }
        return st.isEmpty();
    }
}