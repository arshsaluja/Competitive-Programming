class Solution {
    public int[] plusOne(int[] d) {
        int n=d.length;
        for(int i=n-1;i>=0;i--)
        {
            if(d[i]==9)
            {
                d[i]=0;
            }
            else if(i!=n-1&&d[i+1]==9)
            {
                d[i]+=1;
            }
            else
            {
                d[i]+=1;
                return d;
            }
        }
        if(d[0]==0)
        {
            int di[]=new int[d.length+1];
            
            for(int i=1;i<d.length+1;i++)
            {
                di[i]=0;
            }
            di[0]=1;
            return di;
        }
        return d;
    }
}
