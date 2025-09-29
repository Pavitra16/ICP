class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int visited[][]=new int[n][m];
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && visited[i][j]==0){
                    ans++;
                    solve(grid,visited,i,j);
                }
            }
        }
        return ans;
    }
    public void solve(char grid[][], int visited[][], int row, int col){
        visited[row][col]=1;
        int r[]={0,-1,0,1};
        int c[]={-1,0,1,0};
        for(int i=0;i<r.length;i++){
            int nrow=row+r[i];
            int ncol=col+c[i];
            if(conditions(nrow, ncol, visited, grid)){
                solve(grid,visited,nrow,ncol);
            }
        }
    }
    public boolean conditions(int r, int c, int[][] visited, char[][] grid){
        int n=visited.length;
        int m=visited[0].length;
        return r>=0 && r<n && c>=0 && c<m && visited[r][c]!=1 && grid[r][c]=='1';
    }
}