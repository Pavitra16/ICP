class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
       int i=m-1;
       int j=n-1;
       int end=m+n-1;
       while(i>=0 && j>=0){
        if(a[i]>b[j]){
            a[end]=a[i];
            i--;
            end--;
        }
        else{
            a[end]=b[j];
            j--;
            end--;
        }
       }
      while(i>=0){
        a[end]=a[i];
        end--;
        i--;
    }
      while(j>=0){
        a[end]=b[j];
        end--;
        j--;
      }
    }
}