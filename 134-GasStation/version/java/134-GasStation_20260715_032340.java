// Last updated: 15/07/2026, 03:23:40
/*
 * Arrays: O(n) tc
 * Caveats:
 * 1. optimising brute force soln to O(n) using the logic that : if starting from any station A you fail at a B station, then starting at any station after A - you will still always fail at B.(since you can only start with positive value).
 * 2. mistakenly thinking brute force is the optimised soln lol
*/

1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        int n = gas.length;
4        int netgas = 0;
5        int netcost = 0;
6        int net[] = new int[n];
7        for (int i = 0; i < n; i++) {
8            netgas += gas[i];
9            netcost += cost[i];
10            net[i] = gas[i] - cost[i];
11        }
12        if (netgas < netcost)
13            return -1;
14
15        for (int i = 0; i < n; i++) {
16            if(net[i]>=0){
17                int sum = net[i];
18                int curr = (i+1)%n;
19                while(i!=curr){
20                    sum += net[curr];
21                    if(sum < 0) {
22                        if(curr<i) 
23                            return -1;
24                        else
25                            i = curr-1;
26                        break;
27                    }
28                    curr = (curr+1)%n;
29                }
30                if(i==curr) return i;
31            }
32        }
33        return -1;
34    }
35}