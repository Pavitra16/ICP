class Solution {
    public int lengthOfLIS(int[] nums) {
        int lst[]=new int[nums.length];
        int len=1;
        lst[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>lst[len-1]) {
                lst[len]=nums[i];
                len++;
            }
            else{
                int ind=BinarySearch(nums,lst,len,i);
                lst[ind]=nums[i];
            }

        }
        return len;
    }
    public int BinarySearch(int a[],int lst[], int len, int ind){
        int lo=0;
        int hi=len-1;
        int ele=a[ind];
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(lst[mid]>=ele){
                ans=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
        return ans;
    }
}