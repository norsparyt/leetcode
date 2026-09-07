// Last updated: 08/09/2026, 00:59:09
// Imagine you started at Station A, successfully reached B, but ran out of gas at C. By reaching B, you had accumulated extra gas to bring with you. If you still failed at C even with that extra gas, starting fresh at B (with zero extra gas) guarantees you will fail at C again. Therefore, no station between A and C can possibly be the answer. You can safely skip them all and make C + 1 your new candidate.
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        int cand = 0;
4        int curr_gas = 0;
5        int total_gas = 0;
6        for (int i = 0; i < gas.length; i++) {
7            curr_gas += gas[i] - cost[i];
8            total_gas += gas[i] - cost[i];
9
10            if (curr_gas < 0) {
11                cand = i + 1;
12                curr_gas = 0;
13            }
14        }
15        if(total_gas >= 0) return cand;
16        return -1;
17    }
18}