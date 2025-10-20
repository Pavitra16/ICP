class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int dp[][]=new int[n][n];
        for(int a[]:dp)Arrays.fill(a,Integer.MAX_VALUE);
        return solve(triangle,0,0,dp);

    }
    public int solve(List<List<Integer>>lst,int i,int j, int dp[][]){
        if(j>=lst.size()) return 0;
        if(dp[j][i]!=Integer.MAX_VALUE) return dp[j][i];
        int same=solve(lst,i,j+1,dp);
        int adj=solve(lst,i+1,j+1,dp);
        return dp[j][i]=lst.get(j).get(i)+Math.min(same,adj);
    }
}