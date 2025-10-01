class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(nums,0,dp);
        
    }
    public boolean solve(int a[], int i, int dp[]){
        if(i>=a.length-1) return true;
        if(dp[i]!=-1) return dp[i]==1; 
        for(int j=1;j<=a[i];j++){
           boolean ans=solve(a,i+j,dp);
           if(ans){
            dp[i]=1;
            return true;
           }
           
        }
        dp[i]=0;
        return false;
    }
}