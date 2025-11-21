class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int n=dungeon.length;
        int m=dungeon[0].length;
        int dp[][]=new int[n][m];
        for(int a[]:dp) Arrays.fill(a,Integer.MAX_VALUE);
        return solve(dungeon,0,0,dp);
    }
    public int solve(int a[][], int i, int j, int dp[][]){
        if(i<0 || j<0 || i>=a.length || j>=a[0].length) return Integer.MAX_VALUE;
        if(i==a.length-1 && j==a[0].length-1) return Math.max(1,1-a[i][j]);
        if(dp[i][j]!=Integer.MAX_VALUE)return dp[i][j];
        int down=solve(a,i+1,j,dp);
        int right=solve(a,i,j+1,dp);
        int ans=Math.min(down,right);
       // if(ans==Integer.MAX_VALUE) ans=1;
        ans=Math.max(1,ans-a[i][j]);
        return dp[i][j]=ans;
    }
}