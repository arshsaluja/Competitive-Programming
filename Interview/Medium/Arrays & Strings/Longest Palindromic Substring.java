
class Solution {
    int st=0;int end=0;
    int len=0;int max=0;
    public void common(String s,int l,int r)
    {
        while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r))
            {
              l--;
              r++;
            }
            len=r-l-1;
            if(len>max)
            {
            max=len;
            st=l+1;
            end=r;
            }
    }
    public String longestPalindrome(String s) {
        if(s.length()<=0) return "";
        int l=0;int r=0;
        
        //even
            for(int i=0;i<s.length();i++)
        {
            l=i;r=i+1;
            common(s,l,r);    
        }
        //odd
        for(int i=0;i<s.length();i++)
        {
            l=i;r=i;
            common(s,l,r);    
        }
        return s.substring(st,end);
    }
}
