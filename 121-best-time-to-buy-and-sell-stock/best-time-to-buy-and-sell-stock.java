class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int suff[]=new int[n];
        suff[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--){
            suff[i]=Math.max(prices[i],suff[i+1]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,suff[i]-prices[i]);
        }
        return ans;
    }
}