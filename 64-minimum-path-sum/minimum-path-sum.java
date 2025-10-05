class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        for(int a[]:dp) Arrays.fill(a,-1);
        return solve(grid,0,0,m-1,n-1,dp);
    }
    public int solve(int a[][], int i, int j, int er, int ec,int[][]dp){
        if(i>er || j>ec || i<0 || j<0) return Integer.MAX_VALUE;
        if(i==er && j==ec) return a[i][j];
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=a[i][j];
        int down=solve(a,i+1,j,er,ec,dp);
        int right=solve(a,i,j+1,er,ec,dp);
        ans+=Math.min(down,right);
        return dp[i][j]=ans;
    }
}