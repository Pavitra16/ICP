class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n=a.length;
        int m=b.length;
        if(n>m) return findMedianSortedArrays(b,a);
        int lo=0;
        int hi=n;
        int total=n+m;
        int left=(total+1)/2;
        while(lo<=hi){
            int mid1=(lo+hi)/2;
            int mid2=left-mid1;
            int l1=mid1>0? a[mid1-1] : Integer.MIN_VALUE;
            int l2= mid2>0 ? b[mid2-1] : Integer.MIN_VALUE;
            int r1=mid1<n ? a[mid1] : Integer.MAX_VALUE;
            int r2=mid2<m ? b[mid2] : Integer.MAX_VALUE;

            if(l1<=r2 && l2<=r1){
                if((n+m)%2!=0) return (double)(Math.max(l1,l2));
                return (Math.max(l1,l2) + Math.min(r1,r2))/2.0;
            }
            else if(l1>r2) hi=mid1-1;
            else lo=mid1+1;
        }
        return 0;
    }
}