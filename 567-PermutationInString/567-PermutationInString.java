// Last updated: 30/05/2026, 00:04:50
class Solution {

    public boolean checkInclusion(String s1, String s2) {
        int l = 0;
        int r = s1.length();
        int size = s2.length();
        if (r > size)
            return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < r; i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }

        while (r <= size) {
            boolean allPresent = true;
            for(int i=l;i<r;i++){
                int ch= (int)(s2.charAt(i)-'a');
                if(freq1[ch]!=freq2[ch])
                    {
                        allPresent=false;
                        break;
                        }
            }


            if (allPresent)
                return true;

            // slide window
            if (r < size) {
                freq2[s2.charAt(l) - 'a']--; // remove left
                freq2[s2.charAt(r) - 'a']++; // add right
            }

            l++;
            r++;
        }
        return false;
    }
}