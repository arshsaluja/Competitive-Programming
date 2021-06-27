public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res=0;
       for(int i=1;i<32;i++)
        {
            res+=n&1;
            System.out.println(res);
            n=n>>1;
            res=res<<1;
        }
        if((n&1)==1)
            res=res+1;
        
        return res;
    }
}
