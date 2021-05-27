class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0)
            return 0;
        int s1=0;
        
        if(!((s.charAt(0)>='0'&& s.charAt(0)<='9')||(s.charAt(0)=='+')||(s.charAt(0)=='-')))
            return 0;
        int f=0;
        if(s.charAt(0)=='-')
            f=1;
        else if(s.charAt(0)=='+')
            f=0;
        
            
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)>='0'&&s.charAt(i)<='9')
                {
                    int last=s1;
                    s1=s1*10+s.charAt(i)-48;
                    if(last!=s1/10)
                    {
                        if(f==1) return -2147483648;
                        else return 2147483647;
                            
                    }
                    
                }
                else if(s.charAt(i)=='.')
                    break;
                
                    
                else if(i!=0&&!(s.charAt(i)>='0'&& s.charAt(i)<='9'))
                    break;
            }
        
        if(f==1)
            s1=-1*s1;
        else if(f==0)
            s1=+1*s1;
 
        return s1;
    }
}
