class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int a[]:dp) Arrays.fill(a,-1);
        return solve(0,0,m-1,n-1,dp);
       
    }
    
    public int solve(int cr, int cc, int er, int ec, int dp[][]){
        if(cr==er && cc==ec) {
            return 1;
        }
        if(cr>er || cc>ec || cr<0 || ec<0) return 0;
        if(dp[cr][cc]!=-1) return dp[cr][cc];
        int ans=0;
        int down=ans+solve(cr+1,cc,er,ec,dp);
        int right=ans+solve(cr,cc+1,er,ec,dp);
        return dp[cr][cc]=down+right;

    }
}