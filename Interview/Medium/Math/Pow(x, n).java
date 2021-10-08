class Solution {
    public double rec(double x,int n)
    {
        if(n==0)
            return 1;
        return x*rec(x,n-1);
        
    }
    public double myPow(double x, int n) {
     return rec( x, n);   
    }
}
