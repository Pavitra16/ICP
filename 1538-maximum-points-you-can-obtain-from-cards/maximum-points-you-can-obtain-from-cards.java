class Solution {
    public int maxScore(int[] a, int k) {
        int lsum=0;
        int rsum=0;
        int sum=0;
        for(int i=0;i<k;i++) lsum+=a[i];
        sum=lsum;
        int i=k-1;
        int j=a.length-1;
        while(i>=0){
            lsum-=a[i];
            rsum+=a[j];
            sum=Math.max(sum,lsum+rsum);
            i--;
            j--;
        }
        return sum;

    }
}