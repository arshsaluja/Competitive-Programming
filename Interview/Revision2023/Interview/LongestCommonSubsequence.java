class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        return dp(text1,text2,m,n);
    }
    public int dp(String s, String t,int m,int n) {
        int dpa[][] = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    dpa[i][j] = 0;
                else if (s.charAt(i - 1) == t.charAt(j - 1))
                    dpa[i][j] = dpa[i - 1][j - 1] + 1;
                else
                    dpa[i][j] = Math.max(dpa[i - 1][j], dpa[i][j - 1]);
            }
        }
        return dpa[m][n];
    }
}
