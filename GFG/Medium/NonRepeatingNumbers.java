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
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        int x=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            x=x^nums[i];  
        }
      
        int num=x&~(x-1);
        int one=0;
        int zero=0;
        for(int i=0;i<n;i++){
            if((nums[i]&num)==0){
                one=one^nums[i];
            }
            else{
                 zero=zero^nums[i];
            }
        }
        if(one>zero){
            return new int[] {zero,one};
        } else {
            return new int[] {one,zero};
        }
    }
}
