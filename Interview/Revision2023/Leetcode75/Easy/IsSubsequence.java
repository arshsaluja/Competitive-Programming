class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;

        int j=0;
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            char c2=s.charAt(j);
            if(ch==c2)
            {
                j++;
            }
            if(j>=s.length()) return true;
        }
        return false;
    }
}
