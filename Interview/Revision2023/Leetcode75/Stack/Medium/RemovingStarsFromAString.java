class Solution {
    public String removeStars(String s) {
       Stack<Character> st=new Stack<>();
           for(int i=0;i<s.length();i++){
               char ch=s.charAt(i);
               if(ch=='*'){
                   st.pop();
               }
               else st.push(ch);
           }
           StringBuilder sb=new StringBuilder();

           for(char c:st)
           sb.append(c);

           return sb.toString();
    }
}
