// Last updated: 18/08/2026, 05:50:26
/*
 * Greedy: Insertion Logic/ Sorting
 * Caveats:
 * 1. Clicking of : "Imagine you are managing this line in real life.If you want to guarantee that a newly placed person will never disrupt the k-count of anyone already standing in the line, in what order should you pull people from the original array to place them?" - if you pull tallest people first then short dont disrupt k
 * 2. custom comparator format
 * 3. arraylist .add (index, element) function already pushes array right - no special need of other ds
*/

1class Solution {
2    public int[][] reconstructQueue(int[][] people) {
3        Arrays.sort(people, (a,b)-> (a[0]==b[0])?
4            Integer.compare(a[1],b[1]) :
5            Integer.compare(b[0],a[0]));
6        List<int[]> queue = new ArrayList<>();
7        for(int[] pair : people){
8            queue.add(pair[1], pair);
9            // Java's add(index, element) automatically shifts everything to the right.
10        }
11        int[][] ans = new int[people.length][people[0].length];
12        for(int i =0; i < queue.size(); i++){
13            ans[i][0] = queue.get(i)[0];
14            ans[i][1] = queue.get(i)[1];
15        }
16        return ans;
17    }
18}