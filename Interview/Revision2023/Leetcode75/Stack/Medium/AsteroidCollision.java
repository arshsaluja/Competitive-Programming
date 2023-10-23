class Solution {
    public int[] asteroidCollision(int[] as) {
        Stack<Integer> st=new Stack<>();
        int c=0;
        for(int i=1;i<as.length;i++){
            int se=0;
            if(!st.isEmpty()) se=st.peek();
            else se=as[0];
            int ae=as[i];
            if(se>0&&ae>0||se<0&&ae<0){
                c++;
                st.push(ae);}

            else if(!st.isEmpty()&&se+ae==0) st.pop();
            else {
                c++;
                if(se>ae)
                st.push(se);
                else
                st.push(ae);}
        }

        int []result=new int[c];int i=0;
        while(!st.isEmpty()){
            result[i++]=st.peek();
            st.pop();
        }
        
        return result;
    }
}
