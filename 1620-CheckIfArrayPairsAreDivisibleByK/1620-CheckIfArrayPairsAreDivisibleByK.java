// Last updated: 30/05/2026, 00:04:04
class Solution {
    public boolean canArrange(int[] nums, int k) {
    int[] freq=new int[k];
    
    for (int i = 0; i < nums.length; i++) {
        int remainder= ((nums[i]%k) + k)%k;
        freq[remainder] +=1;
    }
    if(freq[0]%2!=0) return false; // if count of 0 remainder is not even

    for (int remainder = 1; remainder <= k/2; remainder++) {
        //k is even and current remainder is = k/2 and frequency is even

        //smarter way or writing instead of : (k/2==remainder) && (k%2==0)
        if((remainder==k-remainder) && (freq[remainder]%2!=0))
            return false;
        else if(freq[remainder]!=freq[(k-remainder)%k]) //else if remainder has compliment with same count
            return false;
    }
    return true;
    }
}