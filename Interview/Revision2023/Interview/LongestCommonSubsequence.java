class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        return rec(text1,text2,m,n);
    }
    public int rec(String s, String t,int m,int n) {
        if(m==0||n==0) return 0;
        else if(s.charAt(m-1)==t.charAt(n-1))
        return 1+rec(s,t,m-1,n-1);
        else
        return Math.max(rec(s,t,m-1,n),
        rec(s,t,m,n-1));
    }
}
