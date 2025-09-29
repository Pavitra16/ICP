class Solution {
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }
    public boolean solve(char [][] board, int row, int col){
        if(col==9){
            row=row+1;
            col=0;
        }
        if(row==9) return true;
        if(board[row][col]!='.') return solve(board,row,col+1);
        else{
            for(int i=1;i<=9;i++){
            if(isitpossible(board,row,col,i)){
                board[row][col]=(char)(i+'0');
                boolean ans=solve(board,row,col+1);
                if(ans) return true;
            }
            }
            board[row][col]='.';
            return false;
        }
    }
    public boolean isitpossible(char board[][], int row, int col,int val){
        //row
        for(int i=0;i<9;i++){
            if(board[row][i]==(char)(val+'0'))return false;
        }
        for(int i=0;i<9;i++){
            if(board[i][col]==(char)(val+'0')) return false;
        }
        int r=row-(row%3);
        int c=col-(col%3);
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(board[i][j]==(char)(val+'0')) return false;
            }
        }
        return true;

    }
}