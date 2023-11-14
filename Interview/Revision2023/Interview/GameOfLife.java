class Solution {
    public void gameOfLife(int[][] board) {
        int n=board.length;
        int m=board[0].length;
        
        int future[][]=new int[n][m];
        
        for(int l=0;l<n;l++){
            for(int r=0;r<m;r++){
                int aliveN=0;
                
                for(int i=-1;i<=1;i++){
                    for(int j=-1;j<=1;j++){
                        if((i+l)>=0&&(i+l)<n&&(j+r)>=0&&(j+r)<m)
                        aliveN+=board[i+l][j+r];
                    }
                }
                aliveN-=board[l][r];
                // under-population
                if(board[l][r]==1&&aliveN<2) future[l][r]=0;
                
                // this case is in comments because this has been executed in the else cond.
                // next generation 
                // else if(board[l][r]==1&&aliveN>=2) future[l][r]=1;
                
                // over-population
                else if(board[l][r]==1&&aliveN>3) future[l][r]=0;
                
                // reproduction.
                else if(board[l][r]==0&&aliveN==3) future[l][r]=1;
                
                else
                    future[l][r]=board[l][r];
                
            }
        }
        for(int l=0;l<n;l++){
            for(int r=0;r<m;r++){
                board[l][r]=future[l][r];
            }}
    }
}
