class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        int a[]=nums;
        int n=a.length;
        while(i<n){
        int ind=a[i]-1;
        int ele=a[i];
        if(ele>0 && ele<n && ele!=a[ind]){
            //swap
            int temp=a[ind];
            a[ind]=ele;
            a[i]=temp;
        }
        else i++;
        }
        for(int j=0;j<n;j++){
            if(a[j]!=j+1) return j+1;
        }
        return n+1;
    }
}