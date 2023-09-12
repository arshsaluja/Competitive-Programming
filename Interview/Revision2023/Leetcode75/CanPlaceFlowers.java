class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length==1 && flowerbed[0]==0)
        {
            n--;
            flowerbed[0]=1;
        }
        if(flowerbed[0]==0 && flowerbed[1]==0)
        {
            n--;
            flowerbed[0]=1;
        }
        if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0)
        {
            n--;
            flowerbed[flowerbed.length-1]=1;
        }
        for(int i=0;i<flowerbed.length;i++)
        {
            if(flowerbed[i]==0 && i-1>=0&& flowerbed[i-1]!=1&& i+1<flowerbed.length&& flowerbed[i+1]!=1) 
            {
                flowerbed[i]=1;
                n--;
            }
            
            if(n<=0)
            return true;
        }
        return false;
    }
}
