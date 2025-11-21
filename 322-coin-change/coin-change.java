class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,9999999);
        return solve(coins,amount,dp);
    }
    public int solve(int a[], int amt, int dp[]){
        dp[0]=0;
        for(int i=1;i<=amt;i++){
            for(int j=0;j<a.length;j++){
                int c=a[j];
                if(i-c>=0) dp[i]=Math.min(dp[i],1+dp[i-c]);
            }
        }
        if(dp[amt]>=9999999) return -1;
        return dp[amt];
    }
}