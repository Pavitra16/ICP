class Solution {
    public int nthUglyNumber(int n) {
        int a[]=new int[n+1];
        a[1]=1;
        int n1=1;
        int n2=1;
        int n3=1;
        for(int i=2;i<=n;i++){
            int num1=a[n1]*2;
            int num2=a[n2]*3;
            int num3=a[n3]*5;
            a[i]=Math.min(num1,Math.min(num2,num3));
            if(a[i]==num1) n1++;
            if(a[i]==num2) n2++;
            if(a[i]==num3) n3++;
        }
        return a[n];
    }
}