class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int ans[]=new int[n];
        for(int j=0;j<n;j++){
            int len=0;
            for(int i=0;i<m;i++){
                String s=""+Math.abs(grid[i][j]);
                int l=s.length();
                if(grid[i][j]<0) l++;
                len=Math.max(l,len);
            }
            ans[j]=len;
        }
        return ans;
    }
}