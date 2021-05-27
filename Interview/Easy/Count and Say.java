//11
class Solution {
    public String countAndSay(int n) {
        String res="11";
     if(n==1){         
         res="1";
         return res;
             }
        if(n==2){         
         res="11";
         return res;
             }
        
//         System.out.println("jjjj");
//         System.out.println("kk"+res);
        
        for(int j=3;j<=n;j++)
        {
            String ne="";
            res=res+'&';
            int c=1;
        for(int i=1;i<res.length();i++)
        {
                if(res.charAt(i)==res.charAt(i-1))
                    c++;
            
            else
            {
            ne+=Integer.toString(c);
            ne+=res.charAt(i-1);
                c=1;
            }
           //  System.out.print(" "+c);
           //  //System.out.print(v);
           // // System.out.print(ne);
        }
            
        res=ne;
        }
        return res;
    }
}
