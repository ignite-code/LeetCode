class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index=0, totalDiff=0, fuel=0, diff=0;
        for(int i=0;i<gas.length;i++){
            diff = gas[i] - cost[i];
            totalDiff += diff;
            fuel += diff;
            if(fuel<0){
                index = i+1;
                fuel = 0;
            }  
        }
        if(totalDiff<0){
            return -1;
        }
        return index;
        
    }
}