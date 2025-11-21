class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int dp[][][]=new int[strs.length][m+1][n+1];
       for(int a[][]:dp){
        for(int j[]:a) Arrays.fill(j,-1);
       }
        return solve(strs,0,m,n,dp);
    }
    public int solve(String[] strs,int i, int m, int n, int dp[][][]){
       if(i>=strs.length || m<0 || n<0) return 0;
        if(dp[i][m][n]!=-1) return dp[i][m][n];
        int count[]=help(strs[i]);
        int zero=count[0];
        int one=count[1];
        int inc=0;
        int exc=0;
        if(zero<=m && one<=n) inc=1+solve(strs,i+1,m-zero,n-one,dp);
        exc=solve(strs,i+1,m,n,dp);
        return dp[i][m][n]=Math.max(inc,exc);
    }
    public int[] help(String s){
        int zero=0;
        int one=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='0') zero++;
            else one++;
        }
        int a[]={zero,one};
        return a;
    }
}