class Solution {
    public int[] countBits(int n) {
        if(n==0) {
            int a[]={0};
            return a;
        }
        if(n==1) {
            int a[]={0,1};
            return a;
        }
        if(n==2){
            int a[]={0,1,1};
            return a;
        }
       return solve(n);
    }
    public int[] solve(int n){
        int a[]=new int[n+1];
        a[0]=0;
        a[1]=a[2]=1;
        int j=2;
        while(j<=n){
            for(int i=1;i<j;i++){
                if(j+i <= n) {
                    a[j+i]=a[j]+a[i];
                }
            }
            j=j*2;
            if(j<=n) a[j]=1;
        }
        return a;
    }
}