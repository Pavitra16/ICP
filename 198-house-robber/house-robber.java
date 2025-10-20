class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(nums,0,dp);
    }
    public int solve(int a[], int i,int dp[]){
        if(i>=a.length) return 0;
        if(dp[i]!=-1)return dp[i];
       
        int inc=a[i]+solve(a,i+2,dp);
        int exc=solve(a,i+1,dp);
        return dp[i]=Math.max(inc,exc);
        
    }
}