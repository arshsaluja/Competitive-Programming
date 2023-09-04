//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            char mat[][] = new char[n][m];
            for(int i=0; i<n; i++)
            {
                String S[] = in.readLine().trim().split(" ");
                for(int j=0; j<m; j++)
                {
                    mat[i][j] = S[j].charAt(0);
                }
            }
            
            Solution ob = new Solution();
            char[][] ans = ob.fill(n, m, mat);
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    
    static void helper(int i,int j,boolean vis[][],char A[][],int n,int m)
    {
        int dx[]={1,-1,0,0};
        int dy[]={0,0,-1,1};
        
        Queue<int []> q=new LinkedList<>();
        q.add(new int[]{i,j});
        vis[i][j]=true;
        
        while(!q.isEmpty())
        {
            int r=q.peek()[0];
            int c=q.peek()[1];
            q.poll();
            for(int k=0;k<4;k++)
            {
                int row=r+dx[k];
                int col=c+dy[k];
                if(row>=0 && row<n && col>=0 && col<m && !vis[row][col] && A[row][col]=='O')
                {
                    q.add(new int[]{row,col});
                    vis[row][col]=true;
                }
            }
        }
    }
    
    static char[][] fill(int n, int m, char a[][])
    {
        boolean vis[][]=new boolean[n][m];
        for(boolean val[]:vis)
        Arrays.fill(val,false);
        
       
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if((i==0 || j==0 || i==n-1 || j==m-1)  && a[i][j]=='O' && !vis[i][j])
                {
                    helper(i,j,vis,a,n,m);
                }
            }
        }
   
    
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(!vis[i][j])
                a[i][j]='X';
            }
        }
        
        return a;
    }
}
