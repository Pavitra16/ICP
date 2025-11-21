class Solution {
    public int numSquares(int n) {
        if(n==1) return 1;
        List<Integer>lst=new ArrayList<>();
        for(int i=1;i<n;i++){
            if(i*i<=n) lst.add(i*i);
        }
        int dp[]=new int[n+1];
        Arrays.fill(dp,9999999);
        return solve(n,lst,dp);
    }
    public int solve(int n, List<Integer>lst, int dp[]){
        dp[0]=0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<lst.size();j++){
                int c=lst.get(j);
                if(i-c>=0) dp[i]=Math.min(dp[i],1+dp[i-c]);
            }
        }
        if(dp[n]>=9999999) return -1;
        return dp[n];
    }
}