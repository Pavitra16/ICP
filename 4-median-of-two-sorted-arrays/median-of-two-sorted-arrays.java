class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int a[]=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                a[k]=nums1[i];
                i++;
            }
            else {
                a[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            a[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            a[k]=nums2[j];
            j++;
            k++;
        }
        int l=m+n;
        if(l%2!=0) return a[l/2];
        int n1=a[(l-1)/2];
        int n2=a[l/2];
        return (n1+n2)/2.0;

    }
}