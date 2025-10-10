class Solution {
    public int findMaxFish(int[][] grid) {
        int ans=0;
        int m=grid.length;
        int n=grid[0].length;
        int visited[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0) ans=Math.max(ans,dfs(i,j,grid,visited));
                
            }
        }
        return ans;
    }
    public int dfs(int row, int col, int grid[][], int visited[][]){
        visited[row][col]=1;
        int r[]={0,-1,0,1};
        int c[]={-1,0,1,0};
        int sum=grid[row][col];
        for(int i=0;i<r.length;i++){
            
            int nrow=row+r[i];
            int ncol=col+c[i];
            if(nrow>=0 && ncol>=0 && nrow<grid.length && ncol<grid[0].length && visited[nrow][ncol]!=1 && grid[nrow][ncol]!=0){
                
                sum+=dfs(nrow,ncol,grid,visited);
            }
        }
       
        return sum;
    }
    

}