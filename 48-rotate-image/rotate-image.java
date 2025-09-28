class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
    public void transpose(int a[][]){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }
    public void reverse(int a[][]){
        int n=a.length;
        for(int i=0;i<n;i++){
            int si=0;
            int ei=n-1;
            while(si<=ei){
                int temp=a[i][si];
                a[i][si]=a[i][ei];
                a[i][ei]=temp;
                si++;
                ei--;
            }
        }
        
    }
}