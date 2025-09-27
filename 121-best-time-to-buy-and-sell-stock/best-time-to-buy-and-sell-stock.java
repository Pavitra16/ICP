class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int a[]=new int[prices.length];
        int n=prices.length;
        a[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--){
            a[i]=Math.max(a[i+1],prices[i]);
        }
        for(int i=0;i<n;i++){
            ans=Math.max(ans,a[i]-prices[i]);
        }
        return ans;
    }
}