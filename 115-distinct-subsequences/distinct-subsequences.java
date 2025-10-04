class Solution {
    public int numDistinct(String s, String t) {
        int[][]dp=new int[t.length()+1][s.length()];
        for(int i[]:dp) Arrays.fill(i,-1);
        return solve(s,t,0,0,dp);
    }
    public int solve(String s, String t, int i, int j, int[][]dp){
        //t---amount;
        //s---coins
        if(j==t.length()) return 1;
        if(i==s.length()) return 0;
        if(dp[j][i]!=-1) return dp[j][i];
        int inc=0;
        int exc=0;
        if(s.charAt(i)==t.charAt(j)){
            inc=solve(s,t,i+1,j+1,dp);
        }
        exc=solve(s,t,i+1,j,dp);
        return dp[j][i]=inc+exc;
    }
}