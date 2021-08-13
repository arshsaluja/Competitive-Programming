class Solution {
    public boolean exist(char[][] board, String word) {
        return solve(board,word);
    }
    public boolean rec(char[][] board,int row,int col,int k,String s)
    {
        if(k==s.length())
            return true;
        if(row==-1||col==-1||col==board[0].length||row==board.length||board[row][col]!=s.charAt(k))
            return false;
        char temp=board[row][col];
        board[row][col]='*';
            boolean t=rec(board,row-1,col,k+1,s)||
                rec(board,row,col-1,k+1,s)||
                rec(board,row+1,col,k+1,s)||
                rec(board,row,col+1,k+1,s);
         board[row][col]=temp;
        return t;
    }
    public boolean solve(char board[][],String s)
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==s.charAt(0)&&rec(board,i,j,0,s))
                {
                    return true;
                }
            }
        }
        
        return false;
    }
}
