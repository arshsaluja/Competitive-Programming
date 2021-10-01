class Solution {
    public int titleToNumber(String co) {
        int res=0;
       for(int i=0;i<co.length();i++)
       {
           char v=co.charAt(i);
           int d=v-'A'+1;
           res=res*26+d;
       }
        return res;
    }
}
