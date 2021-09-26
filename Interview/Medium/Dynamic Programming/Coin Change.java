class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int x[][]=new int [n+1][amount+1];
        
        for(int i=0;i<=coins.length;++i)
        {
            for(int j=0;j<=amount;++j)
            {
              if(j==0)
                  x[i][j]=0;
                else if(i==0)
                    x[i][j]=100000;
                else if(coins[i-1]>j)
                    x[i][j]=x[i-1][j];
                else
                    x[i][j]=Math.min(1+x[i][j-coins[i-1]],x[i-1][j]);
                
            }
        }
        return x[n][amount]>10000?-1:x[n][amount];
    }
}
