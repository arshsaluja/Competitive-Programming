class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int c=0;
        int n=coins.length;
        for(int i=n-1;i>=0;i--)
        {
            if(amount==0)
                return c;
            while(coins[i]<=amount)
            {
                amount=amount-coins[i];
                c++;
            }
        }
        if(amount>0)
            return -1;
        else return c;
    }
}
