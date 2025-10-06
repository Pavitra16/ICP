class Solution {
    public int change(int amount, int[] coins) {
         int dp[][] = new int[amount+1][coins.length];
         for(int a[]:dp)Arrays.fill(a,-1);
         return solve1(amount,coins,0,dp);
       // return solve2(amount,coins);
    }
    public int solve1(int amt, int[] coins, int i,int[][] dp){
        if(amt==0) return 1;
        if(i>=coins.length ) return 0;
        if(dp[amt][i]!=-1) return dp[amt][i];
        int inc=0;
        int exc=0;
       if(amt>=coins[i]) inc=solve1(amt-coins[i],coins,i,dp);
        exc=solve1(amt,coins,i+1,dp);
        return dp[amt][i]=inc+exc;


    }
    public int solve2(int amt, int [] coins){
        int dp[][]=new int[amt+1][coins.length+1];
        for(int i=0;i<dp[0].length;i++) dp[0][i]=1;
        for(int i=1;i<=amt;i++) dp[i][0]=0;
        
        for(int i=1;i<=amt;i++){

            for(int j=1;j<dp[0].length;j++){
                int exc=0;
                int inc=0;
               exc=dp[i][j-1];
                if(i>=coins[j-1]){
                    inc=dp[i-coins[j-1]][j];
                }
                dp[i][j]=exc+inc;
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}