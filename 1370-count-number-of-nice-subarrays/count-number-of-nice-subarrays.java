class Solution {
    public int numberOfSubarrays(int[] a, int k) {
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0) a[i]=0;
            else a[i]=1;
        }
        return solve(a,k)-solve(a,k-1);

    }
    public int solve(int a[], int k){
        int ans=0;
        int sum=0;
        int i=0;
        int j=0;
        while(j<a.length){
            sum+=a[j];
            while(sum>k){
                sum-=a[i];
                i++;
            }
            ans+=(j-i+1);
            j++;
        }
        return ans;
    }
}