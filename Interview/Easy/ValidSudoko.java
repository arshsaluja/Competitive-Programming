class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet <String> h=new HashSet <String>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j] !='.'){
                if(!h.add(board[i][j]+"rows"+i)||!h.add(board[i][j]+"column"+j)||!h.add(board[i][j]+"r & c "+i/3+"-"+j/3))
                    return false;
                }
                
                    
            }
        }
        return true;
    }
}
