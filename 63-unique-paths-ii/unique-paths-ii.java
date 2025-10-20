class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        if(grid[grid.length-1][grid[0].length-1]==1) return 0;
        int dp[][]=new int[grid.length][grid[0].length];
        for(int a[]:dp)Arrays.fill(a,-1);
        return solve(grid,0,0,grid.length-1,grid[0].length-1,dp);
    }
    public int solve(int a[][], int cr, int cc, int er, int ec, int dp[][]){
        if(cr==er && cc==ec)return 1;
        if(cr>er || cc>ec || cr<0 || ec<0 || a[cr][cc]==1) return 0;
        if(dp[cr][cc]!=-1) return dp[cr][cc];
        int ans=0;
        int down=ans+solve(a,cr+1,cc,er,ec,dp);
        int right=ans+solve(a,cr,cc+1,er,ec,dp);
        return dp[cr][cc]=down+right;
    }
}