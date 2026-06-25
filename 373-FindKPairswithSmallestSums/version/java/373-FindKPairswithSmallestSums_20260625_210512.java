// Last updated: 25/06/2026, 21:05:12
/*
 * Two pointer approach - tough
 * caveats: -remembering the last checked index and coming back to it if min sum is not found in future
 * - look at submission comments
*/

1class Solution {
2    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
3        List<List<Integer>> ans = new ArrayList<>();
4        int n1 = nums1.length;
5        int n2 = nums2.length;
6        int[] index2 = new int[n1];
7        //this stores the index of element in array 2 which was last added to the ans :
8        //minIndex[i] = stores index of nums 2 element which makes min sum with ith index of nums1
9        while(k>0){
10            int min_index = -1;
11            int min_sum = Integer.MAX_VALUE;
12            //do k rounds for finding k pairs
13            for(int i = 0; i < n1; i++){
14                //go through nums1 and find min sum with indexes stored in index2 (all 0's by default)
15                if(index2[i]>=n2)
16                    continue;
17                //checked all pairs for ith element in nums1
18                int curr_sum = nums1[i] + nums2[index2[i]];
19                if(curr_sum < min_sum)
20                {
21                    min_sum = curr_sum;
22                    min_index = i; 
23                }
24                if(index2[i]==0)
25                    break;
26            }
27            if(min_index == -1)
28                break;
29            List<Integer> pair = new ArrayList<>();
30            pair.add(nums1[min_index]);
31            pair.add(nums2[index2[min_index]]);
32            ans.add(pair);
33            //add to ans
34            index2[min_index]++;
35            //checked so increase index
36            k--;
37        }
38        return ans;
39    }
40}