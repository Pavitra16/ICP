class Solution {
    public void setZeroes(int[][] m) {
        int r[]=new int[m.length];
        int c[]=new int[m[0].length];
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]==0){
                    r[i]=1;
                    c[j]=1;
                }
            }
        }
        for(int i=0;i<r.length;i++){
            if(r[i]==1){
                for(int j=0;j<m[0].length;j++){
                    m[i][j]=0;
                }
            }
        }
        for(int i=0;i<c.length;i++){
            if(c[i]==1){
                for(int j=0;j<m.length;j++) m[j][i]=0;
            }
        }
    }
}