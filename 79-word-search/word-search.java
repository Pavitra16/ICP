class Solution {
    public boolean exist(char[][] b, String word) {
        int n=b.length;
        int m=b[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(b[i][j]==word.charAt(0)){
                    boolean ans=solve(b,word,i,j,0);
                    if(ans) return true;
                }
            }
        }
        return false;
    }
    public boolean solve(char a[][], String s, int cr, int cc,int ind){
        if(ind==s.length()) return true;
        if(cr<0 || cc<0 || cr>=a.length || cc>=a[0].length ||s.charAt(ind)!=a[cr][cc]) return false;
        a[cr][cc]='*';
        int r[]={0,-1,0,1};
        int c[]={-1,0,1,0};
        for(int i=0;i<r.length;i++){
            boolean ans=solve(a,s,cr+r[i],cc+c[i],ind+1);
            if(ans) return true;

        }
        a[cr][cc]=s.charAt(ind);
        return false;
    }
}