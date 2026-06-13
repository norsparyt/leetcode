// Last updated: 13/06/2026, 19:20:04
1class Solution {
2    public int[][] kClosest(int[][] points, int k) {
3        //normal approach nlogn - sorting
4        //better approach - quickselect fucntion (DIFFICULT)
5        //best approach - min heap ( remember whenever nlogn needs to be optimised)
6        //also - top k elements needed? min heap of size k hehe
7        quickSelect(0, points.length -1, points, k);
8        int[][] ans = new int[k][2];
9        for( int i=0; i<k ;i++){
10            ans[i] = points[i];
11        }
12        return ans;
13        
14    }
15    void quickSelect(int left, int right, int[][] points, int k){
16        if(left >= right) return;
17        int pivot = partition(left, right, points);
18        int leftCount = pivot - left + 1; // including pivot
19        if(leftCount == k)
20            return;
21        if(leftCount > k)
22            quickSelect(left, pivot - 1, points, k);
23        else
24            quickSelect(pivot + 1, right, points, k - leftCount);
25
26    }
27    int partition(int left, int right, int[][] points){
28        int i = left;
29        int j= left;
30        int[] pivot = points[right];
31        while(i <= right){
32            if(distance(points[i]) <= distance(pivot))
33            {
34                int[] temp = points[i];
35                points[i] = points[j];
36                points[j] = temp;
37                i++;
38                j++;
39            }
40            else{
41                i++;
42            }
43        }
44        return j-1;
45    }
46    int distance(int[] point){
47        return (point[0]*point[0] + point[1]*point[1]);
48    }
49}