class Solution {
    public int calculate(String s) {
        Stack <Integer> st=new Stack<>();
            
        int n;
        if(s==null || (n = s.length())==0) return 0;
        
        int num=0;char sign='+';
        
        for(int i=0;i<n;i++){
            if(Character.isDigit(s.charAt(i))){
                num=num*10+s.charAt(i)-'0';
            }
            
            if((!Character.isDigit(s.charAt(i)))&&' '!=s.charAt(i)||i==n-1){
                 if(sign=='-'){
                    st.push(-num);
                }
                if(sign=='+'){
                    st.push(num);
                }
                 if(sign=='*'){
                    st.push(st.pop()*num);
                }
                 if(sign=='/'){
                    st.push(st.pop()/num);
                }
                sign=s.charAt(i);
                num=0;
            }
        }
        int res=0;
        for(int i:st){
            res +=i;
        }
        return res;
    }
}
