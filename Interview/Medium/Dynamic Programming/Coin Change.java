class Solution {
    public int coinChange(int[] coins, int amount) {
        int x[]=new int [amount+1];
        x[0]=1;
        for(int i=0;i<coins.length;i++)
        {
            for(int j=coins[i];j<x.length;j++)
            {
                x[j]+=x[j-coins[i]];
                
            }
        }
        return x[amount];
    }
}
