class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1)
            return strs[0];
        int s=0;
        String s1=strs[0];
                String s2=strs[1];
        if(strs[1].length()<strs[0].length())
                s=strs[1].length();
        else
                s=strs[0].length();
        for(int i=1;i<strs.length;i++)
        {
            String n="";
            s2=strs[i];
            if(s1.length()<s2.length())
                s=s1.length();
        else
                s=s2.length();
            for(int j=0;j<s;j++)
            {
                
                if(s1.charAt(j)==s2.charAt(j))
                {
                    n=n+s1.charAt(j);
                    // System.out.println(s1.charAt(j)+" "+j);
                }
                else
                    break;
                
            }
            s1=n;
            
        }
        return s1;
    }
}
