class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        String st="";
        String s1="";
        s=s.toLowerCase();
        for(int i=0;i<n;i++)
        {
            
            char ch=s.charAt(i);
            if(ch>=65&& ch<=90 || ch>=97&&ch<=122||ch>=48 && ch<=57)
            s1=s1+ch;
            
        }
        for(int i=n-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(ch>=65&& ch<=90 || ch>=97&&ch<=122||ch>=48 && ch<=57)
            st=st+ch;
            
            
        }
        if(s1.compareToIgnoreCase(st)==0)
            return true;
        else 
            return false;
            
    }
}
