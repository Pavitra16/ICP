class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int num=numBottles;
        int i=numExchange;
        int ans=num;
        while(num>=i){
            ans+=(num/i);
            int left=num%i;
            int q=num/i;
            num=left+q;
        }
        return ans;
    }
}