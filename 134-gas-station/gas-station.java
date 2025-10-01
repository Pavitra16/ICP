class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int g=0;
        int c=0;
        for(int i=0;i<gas.length;i++){
            g+=gas[i];
            c+=cost[i];
           
        }
         if(g<c) return -1;
        int curr=0;
        int ind=0;
        for(int i=0;i<gas.length;i++){
            curr+=gas[i]-cost[i];
            if(curr<0){
                curr=0;
                ind=i+1;
            }
        }
        return ind;
    }
}