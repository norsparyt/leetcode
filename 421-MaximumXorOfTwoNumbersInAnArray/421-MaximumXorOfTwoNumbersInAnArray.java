// Last updated: 30/05/2026, 00:05:07
class Solution {
    TrieNode root;

    public int findMaximumXOR(int[] nums) {
        root = new TrieNode();
        createTrie(nums);
        int maxXOR = 0; //this is because element of array cannot be negative
        for (int i = 0; i < nums.length; i++) {
            maxXOR = Math.max(maxXOR,findXOR(nums[i]));
        }
        return maxXOR;
    }

    int findXOR(int element) {
        TrieNode curr = root;
        int xor = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (element >> i) & 1;
            if(curr.children[1-bit] != null){
                curr = curr.children[1-bit];
                xor = (1<<i) | xor; //put 1 at the ith bit (since xor is always 0) AND
                // since its xor so bits will be different so bit = 1 only
            }
            else
                curr = curr.children[bit];
        }
        return xor;
    }

    TrieNode createTrie(int[] nums) {
        TrieNode temp = root;
        for (int j = 0; j < nums.length; j++) {
            int val = nums[j];
            temp = root;
            //build nodes for each bit
            for (int i = 31; i >= 0; i--) {
                int bit = (val >> i) & 1;
                if (temp.children[bit] == null) {
                    temp.children[bit] = new TrieNode();
                }
                temp = temp.children[bit];
            }
        }
        return root;
    }
}

class TrieNode {
    TrieNode[] children;

    TrieNode() {
        this.children = new TrieNode[2];
    }
}