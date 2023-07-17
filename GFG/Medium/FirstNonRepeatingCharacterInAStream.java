//{ Driver Code Starts
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
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder result=new StringBuilder();
        Queue<Character> q=new LinkedList<>();
        
        for(char ch: A.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            q.add(ch);
            while(!q.isEmpty())
            {
                char first=q.peek();
                if(map.get(first)>1)
                {
                    q.remove();
                }
                else{
                result.append(first);
                break;}
            }
            if(q.isEmpty()){
            result.append('#');}
        }
        return result.toString();
    }
}
