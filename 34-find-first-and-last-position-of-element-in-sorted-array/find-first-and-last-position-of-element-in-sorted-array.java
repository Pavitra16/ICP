class Solution {
    public static int first(int a[], int target){
        int lo=0;
        int hi=a.length-1;
        int ans=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(a[mid]==target){
                ans=mid;
                hi=mid-1;
            }
            else if(a[mid]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static int last(int a[], int target){
        int lo=0;
        int hi=a.length-1;
        int ans=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(a[mid]==target){
                ans=mid;
                lo=mid+1;
            }
            else if(a[mid]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int st=first(nums,target);
        int ed=last(nums,target);
        int a[]={st,ed};
        return a;
    }
}