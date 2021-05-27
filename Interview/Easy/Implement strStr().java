
//haystack = "hlello", needle = "ll"
class Solution {
    public int strStr(String haystack, String needle) {
        int hl=haystack.length();
        int nl=needle.length();
        if(nl>hl)
            return -1;
        if(nl==0)
            return 0;
        int res=0;int f=0;
        for(int i=0;i<hl-nl+1;i++)
        {
            int d=haystack.charAt(i);
            if(d==needle.charAt(0))
            {
                res=i;
                for(int j=0;j<nl;j++)
                {
                    f=0;
                    if(haystack.charAt(res+j)==needle.charAt(j))
                        f=1;
                    else
                    {
                        f=0;
                        break;
                    }
                    
                }
            }
            if(f==1)
            return res;
        }
        
        return -1;
    }
}
