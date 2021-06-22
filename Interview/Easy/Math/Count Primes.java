class Solution {
    public int countPrimes(int n) {
        boolean a[]=new boolean[n+1];
        int c=0;
        for(int i =2;i<n;i++)
        {
            if(!a[i])
            {
                c++;
            for(int j=1;i*j<n;j++)
            {
                if(a[i*j]==false)
                {
              
                a[i*j]=true;
                }
            }
            }
        }
        return c;
    }
}
