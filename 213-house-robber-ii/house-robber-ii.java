class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        int first=solve(nums,0,nums.length-2,dp);
        Arrays.fill(dp,-1);
        int last=solve(nums,1,nums.length-1,dp);
        return Math.max(first,last);
    }
    public int solve(int a[], int i, int ed,int dp[]){
        if(i>ed) return 0;
        if(dp[i]!=-1) return dp[i];
        int inc=a[i]+solve(a,i+2,ed,dp);
        int exc=solve(a,i+1,ed,dp);
        return dp[i]=Math.max(inc,exc);
    }
}