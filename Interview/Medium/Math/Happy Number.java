class Solution {
    public boolean isHappy(int n) {
        if(n==1)
            return true;
     if(n<10&n!=1)
         return false;
        while(n>9)
        {
            int sq=0;int sum=0;
            while(n>0)
            {
                int c=n%10;
                sq=c*c;
                sum+=sq;
                n=n/10;
                System.out.println("sum"+sum);
                 System.out.println(" n "+n);
            }
                n=sum;
            if(n==1)
                return true;
        }
        return true;
        
    }
}
