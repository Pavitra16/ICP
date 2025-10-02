class Solution {
    public int numSubarraysWithSum(int[] n, int goal) {
        return solve(n,goal)-solve(n,goal-1);
    }
    public int solve(int n[], int goal){
        int sum=0;
        int i=0;
        int c=0;
        if(goal<0) return 0;
        for(int j=0;j<n.length;j++){
            sum+=n[j];
            while(sum>goal){
                sum-=n[i];
                i++;
            }
            c+=(j-i+1);
            
        
        }
        return c;
    }
}