class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        Queue<Integer> q = new LinkedList<>();
        int n = gas.length;
        int totalGas = 0, start = 0, tank = 0, totalCost = 0;

        for(int i = 0; i < n; i++){
            totalGas += gas[i];
            totalCost += cost[i];
            tank += gas[i] - cost[i];

            if(tank < 0){
                start = i + 1;
                tank = 0;
            } 
        }
        return (totalGas < totalCost) ? -1 : start;
    }
}