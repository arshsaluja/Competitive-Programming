//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int grid[][] = new int[9][9];
            for(int i = 0; i < 9; i++)
            {
                for(int j = 0; j < 9; j++)
                grid[i][j] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            if(ob.SolveSudoku(grid) == true)
                ob.printGrid(grid);
            else
                System.out.print("NO solution exists");
            System.out.println();
            
        }
    }
}




// } Driver Code Ends


//User function Template for Java

class Solution
{
    static boolean isSafe(int i,int j,int x,int grid[][])
    {
        for(int k=0;k<9;k++)
        {
            if(grid[k][j]==x|| grid[i][k]==x) return false;
        }
        int s=(int)Math.sqrt(9);
        int rs=i-i%s;
        int cs=j-j%s;
        for(int ii=0;ii<s;ii++)
        {
            for(int jj=0;jj<s;jj++)
            {
                if(grid[ii+rs][jj+cs]==x) return false;
            }
            
        }
        return true;
        
    }
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
        // add your code here
        int i,j=0;
        for(i=0;i<9;i++){
            for(j=0;j<9;j++)
            {
                if(grid[i][j]==0)
                {
                    for(int x=1;x<=9;x++)
        {
            if(isSafe(i,j,x,grid))
            {
                grid[i][j]=x;
                if(SolveSudoku(grid)) return true;
                grid[i][j]=0;
            }
        }
        return false;
                }
            }
        }
        return true;
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        // add your code here
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(grid[i][j]+" ");
            }
            
        }
    }
}
