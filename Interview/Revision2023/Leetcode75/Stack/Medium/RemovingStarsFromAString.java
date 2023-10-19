class Solution {
    public String removeStars(String s) {
        String str="";
       Stack<Character> st=new Stack<>();
       Stack<Character> st2=new Stack<>();
           for(int i=0;i<s.length();i++){
               char ch=s.charAt(i);
               if(ch=='*'){
                   st.pop();
               }
               else st.push(ch);
           }
           System.out.println(st);
           while(!st.isEmpty()){
               st2.push(st.peek());
               st.pop();
           }
           while(!st2.isEmpty()){
               str+=st2.peek();
               st2.pop();
           }
           return str;
    }
}
