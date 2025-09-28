class Solution {
    public int search(int[] nums, int target) {
        int t=target;
        int a[]=nums;
        int lo=0;
        int hi=a.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(a[mid]==t) return mid;
            if(a[mid]>=a[lo]){
                if(t>=a[lo] && t<=a[mid] ) hi=mid-1;
                else lo=mid+1;
            }
            else{
                if(t>=a[mid] && t<=a[hi]) lo=mid+1;
                else hi=mid-1;
            }
        }
        return -1;
    }
}