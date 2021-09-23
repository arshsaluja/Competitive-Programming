class Solution {
    public int uniquePaths(int m, int n) {
        int matrix[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            matrix[i][0]=1;
        }
        for(int i=0;i<n;i++)
        {
            matrix[0][i]=1;
        }
        return solve(m,n,matrix);
    }
    public int solve(int m,int n,int matrix[][])
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i>0&&j>0)
                matrix[i][j]=matrix[i-1][j]+matrix[i][j-1];
            }
        }
        return matrix[m-1][n-1];
    }
}
