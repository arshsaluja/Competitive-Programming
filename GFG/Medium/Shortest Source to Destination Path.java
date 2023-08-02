//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            int a[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
            }
            String s1[] = read.readLine().split(" ");
            x = Integer.parseInt(s1[0]);
            y = Integer.parseInt(s1[1]);
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(N, M, a, x, y));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class pair{
    int x,y,dist;
    pair(int x,int y,int dist)
    {
        this.x=x;
        this.y=y;
        this.dist=dist;
    }
}
class Solution {
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        // code here
        if(A[0][0]==0) return -1;
        Queue<pair> q=new LinkedList<>();
        boolean visited[][]=new boolean[N][M];
        int xx[]={-1,1,0,0};
        int yy[]={0,0,-1,1};
        
        visited[0][0]=true;
        q.add(new pair(0,0,0));
        
        while(!q.isEmpty())
        {
            pair pair=q.remove();
            int rx=pair.x;
            int cy=pair.y;
            int dist=pair.dist;
            
            if(X==rx&&Y==cy)
            return dist;
            
            for(int i=0;i<4;i++){
                int rr=rx+xx[i];
                int cc=cy+yy[i];
                if(isValid(rr,cc,A,visited,N,M)){
                    visited[rr][cc]=true;
                    q.add( new pair(rr,cc,dist+1));
                }
            }
        }
        return -1;
    }
    public boolean isValid(int r,int c,int A[][],boolean visited[][] ,int N, int M){
        if(r>=0 && c>=0 && r<N&& c<M&& !visited[r][c] && A[r][c]==1)
        return true;
        return false;
    }
    
};
