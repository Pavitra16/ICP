class Solution {
    public int minDistance(String word1, String word2) {
        int dp[][]=new int[word1.length()+1][word2.length()+1];
        for(int a[]:dp) Arrays.fill(a,-1);
        return solve(word1,word2,0,0,dp);
    }
    public int solve(String s1, String s2, int i, int j, int dp[][]){
        if(i==s1.length()) return s2.length()-j;
        if(j==s2.length()) return s1.length()-i;
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)) ans= solve(s1,s2,i+1,j+1,dp);
      else{
        int ins=solve(s1,s2,i,j+1,dp);
        int del=solve(s1,s2,i+1,j,dp);
        int rep=solve(s1,s2,i+1,j+1,dp);
        ans=1+Math.min(ins,Math.min(del,rep));
      }
        return dp[i][j]=ans;
    }
}