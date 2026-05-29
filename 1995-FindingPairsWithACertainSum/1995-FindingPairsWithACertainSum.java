// Last updated: 30/05/2026, 00:03:49
class FindSumPairs {
    //trying gemini's solution for speed comparison
    private int[] nums1;
    private int[] nums2;
    private Map<Integer, Integer> freqMap;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.freqMap = new HashMap<>();

        // Populate the initial frequencies of elements in nums2
        for (int num : nums2) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
    }

    public void add(int index, int val) {
        // 1. Get the current (old) value before updating
        int oldVal = nums2[index];

        // 2. Decrease the frequency of the old value in the map
        int oldCount = freqMap.get(oldVal);
        if (oldCount == 1) {
            freqMap.remove(oldVal); // Remove to save space and minor lookup time
        } else {
            freqMap.put(oldVal, oldCount - 1);
        }

        // 3. Update the value in the actual array
        nums2[index] += val;
        int newVal = nums2[index];

        // 4. Increase the frequency of the new value in the map
        freqMap.put(newVal, freqMap.getOrDefault(newVal, 0) + 1);
    }

    public int count(int tot) {
        int pairCount = 0;

        // Iterate through the smaller/static array
        for (int num : nums1) {
            int complement = tot - num;

            // Check if the complement exists in nums2
            if (freqMap.containsKey(complement)) {
                pairCount += freqMap.get(complement);
            }
        }

        return pairCount;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */