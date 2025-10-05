class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length-1;
        int dp[][]=new int[n+1][n+1];
        for(int a[]:dp) Arrays.fill(a,-6666666);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<=n;i++){
            ans=Math.min(ans,solve(matrix,0,i,n,n,dp));
        }
        return ans;
    }
    public int solve(int a[][], int i, int j, int er, int ec, int[][]dp){
        if(i>er || j>ec || i<0 || j<0) return Integer.MAX_VALUE;
        if(i==er) return a[i][j];
        if(dp[i][j]!=-6666666) return dp[i][j];
        int ans=a[i][j];
        int l=solve(a,i+1,j-1,er,ec,dp);
        int r=solve(a,i+1,j+1,er,ec,dp);
        int d=solve(a,i+1,j,er,ec,dp);
        ans+=Math.min(d,Math.min(l,r));
        return dp[i][j]=ans;
    }
}