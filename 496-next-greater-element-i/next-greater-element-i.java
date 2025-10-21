class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       for(int i=0;i<nums1.length;i++){
        int ele=nums1[i];
        int placed=0;
        for(int j=0;j<nums2.length;j++){
            if(nums2[j]==ele){
                for(int k=j+1;k<nums2.length;k++){
                    if(nums2[k]>ele){
                        nums1[i]=nums2[k];
                        placed=1;
                        break;
                    }
                }
                if(placed==0){
                    nums1[i]=-1;

                }
                break;
            }
        }
       }
       return nums1;
    }
}