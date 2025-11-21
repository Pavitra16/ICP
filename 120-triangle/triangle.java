class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int dp[][]=new int[n][n];
        for(int a[]:dp)Arrays.fill(a,Integer.MAX_VALUE) ;
        return solve(triangle,0,0,dp);
    }
    public int solve(List<List<Integer>>lst, int i, int j,int dp[][]){
        if(i>=lst.size() || j>=lst.get(i).size()) return 0;
        if(dp[i][j]!=Integer.MAX_VALUE) return dp[i][j];
        int ind=lst.get(i).get(j)+solve(lst,i+1,j,dp);
        int ind1=lst.get(i).get(j)+solve(lst,i+1,j+1,dp);
        return dp[i][j]=Math.min(ind,ind1);
    }
}