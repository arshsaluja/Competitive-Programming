//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            int ans = ob.Count(matrix);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int  Count(int[][] matrix)
    {
        // code here
        int total=0;int rL=matrix.length;
        int cL=matrix[0].length;
        
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                int count=0;
                if(matrix[i][j]==1)
                {
                    int r[] = {-1,-1,-1,0,1,1,1,0};
                int c[] = {-1,0,1,1,1,0,-1,-1};
                for(int k=0;k<8;k++){
                    int nr = i + r[k];
                    int nc = j + c[k];
                    if(nr>=0 && nr<rL && nc>=0 && nc<cL && matrix[nr][nc]==0)
                    count++;
                }
                    if(count!=0&&count%2==0)
                    total++;
                    
                }
            }
        }
        return total;
    }
}
