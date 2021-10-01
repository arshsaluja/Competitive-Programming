class Solution {
    public int titleToNumber(String co) {
        int res=0;
       for(char c:co.toCharArray())
       {
           int d=c-'A'+1;
           res=res*26+d;
       }
        return res;
    }
}
