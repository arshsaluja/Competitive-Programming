class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
            //int min=Integer.MAX_VALUE;
        int min=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(min>prices[i]) min=prices[i];
            if(max<prices[i]-min) max=prices[i]-min;
        }
        return max;
    }
}
