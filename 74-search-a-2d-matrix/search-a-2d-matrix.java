class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return search(matrix,target);
    }
    public boolean search(int a[][], int tar){
        int n=a.length;
        int m=a[0].length;
        int i=0;
        int j=m-1;
        while(i<n && j>=0){
            int ele=a[i][j];
            if(ele==tar) return true;
            if(tar>ele) i++;
            else j--;
        }
        return false;
    }
}