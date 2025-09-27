class Solution {
    public int findPeakElement(int[] a) {
        if(a.length==1) return 0;
        int lo=0;
        int hi=a.length;
        int n=a.length;
        while(lo<=hi){
            int mid=(hi+lo)/2;
            if(mid==0 && a[mid]>a[mid+1]) return mid;
            else if(mid==n-1 && a[mid]>a[mid-1]) return mid;
            else if( mid!=0 && mid!=n-1 && a[mid]>a[mid-1] && a[mid]>a[mid+1]) return mid;
            
            if(mid==0 || (a[mid]>a[mid-1] && a[mid]<a[mid+1])) lo=mid+1;
            else  hi=mid-1;
        }
        return 0;
    }
}