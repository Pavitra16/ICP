class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean ans=solve(board,word,0,i,j,board.length,board[0].length);
                    if(ans) return true;
                }
            }
        }
        return false;

    }
    public boolean solve(char grid[][] ,String word, int  ind,int cr, int cc, int er, int ec){
    if(ind==word.length()) return true;
    if(cr>=er || cr<0 || cc<0 || cc>=ec || ind>word.length() || word.charAt(ind)!=grid[cr][cc]) return false;
    grid[cr][cc]='*';
    int r[]={0,-1,0,1};
    int c[]={-1,0,1,0};
    for(int i=0;i<r.length;i++){
        boolean ans=solve(grid,word,ind+1,cr+r[i],cc+c[i],er,ec);
        if(ans) return true;
    }
    grid[cr][cc]=word.charAt(ind);
    return false;

    }
}