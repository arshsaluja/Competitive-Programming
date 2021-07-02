class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> row=new HashSet<>();
        Set<Integer> col=new HashSet<>();
        if(matrix[0].length<=0)
            return;
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int j:row)
        {
        for(int i=0;i<matrix[0].length;i++)
        {
            matrix[j][i]=0;
        }
        }
        for(int j:col)
        {
        for(int i=0;i<matrix.length;i++)
        {
            matrix[i][j]=0;
        }
        }
    }
}
