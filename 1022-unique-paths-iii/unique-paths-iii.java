class Solution {
    public int uniquePathsIII(int[][] grid) {
        int cr=0,cc=0,total=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0) total++;
                else if(grid[i][j]==1){
                    cr=i;
                    cc=j;
                }
            }
        }
        return solve(grid,cr,cc,total);
    }
    public int solve(int a[][], int cr,int cc, int total){
        if(cr>=a.length || cc>=a[0].length || cr<0 || cc<0 || a[cr][cc]==-1) return 0;
        if(a[cr][cc]==2) return total==-1?1:0;
        a[cr][cc]=-1;
        total--;
        int r[]={0,1,0,-1};
        int c[]={1,0,-1,0};
        int ans=0;
        for(int i=0;i<r.length;i++){
            ans+=solve(a,cr+r[i],cc+c[i],total);
        }
        a[cr][cc]=0;
        return ans;
    }
}