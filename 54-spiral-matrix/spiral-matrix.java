class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>lst=new ArrayList<>();
        solve(matrix,lst);
        return lst;
    }
    public void solve(int a[][], List<Integer>lst){
        int n=a.length;
        int m=a[0].length;
        int cr=0;
        int cc=0;
        int er=n-1;
        int ec=m-1;
        int total=n*m;
        while(cr<n && cc<m && er>=0 && ec>=0 && total>0){
            for(int i=cc;i<=ec && total>0;i++){
                lst.add(a[cr][i]);
                total--;
            }
            cr++;
            for(int i=cr;i<=er && total>0;i++){
                lst.add(a[i][ec]);
                total--;
            }
            ec--;
            for(int i=ec;i>=cc && total>0;i--){
                lst.add(a[er][i]);
                total--;
            }
            er--;
            for(int i=er;i>=cr && total>0;i--){
                lst.add(a[i][cc]);
                total--;
            }
            cc++;
        }
    }
}