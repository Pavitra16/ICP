class Solution {
    public int nextBeautifulNumber(int n) {
        for(int i=n+1;i<=1224444;i++){
            if(solve(i)) return i;
        }
        return -1;
    }
    public boolean solve(int n){
        int freq[]=new int[10];
        while(n!=0){
            int rem=n%10;
            freq[rem]++;
            n/=10;
        }
        for(int i=0;i<10;i++){
            if(freq[i]>0 && freq[i]!=i) return false;
        }
        return true;
    }
}