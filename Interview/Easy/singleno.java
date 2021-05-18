class Solution {
    public int singleNumber(int[] a) {
        Arrays.sort(a);
        int n=a.length;
        int c=0;
        int ans=0;
        for(int i=0;i<n-1;i=i+2)
        {
            if(a[i]!=a[i+1])
            {
                c=1;
                ans=a[i];
                return ans;
            }
            
        }
        if(c==0)
            ans=a[n-1];
        return ans;
    }
}
