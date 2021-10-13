class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> s=new Stack<>();
     for(String str:tokens)
     {
         if(str.equals("+"))
         {
             int a=s.pop();
             int b=s.pop();
             s.add(a+b);
         }
         else if(str.equals("-"))
         {
              int a=s.pop();
             int b=s.pop();
             s.add(b-a);
         }
         else if(str.equals("*"))
         {
              int a=s.pop();
             int b=s.pop();
             s.add(a*b);
         }
         else if(str.equals("/"))
         {
              int a=s.pop();
             int b=s.pop();
             s.add(b/a);
         }
         else
         {
             s.add(Integer.parseInt (str));
         }
         
     }
        return s.pop();
    }
}
