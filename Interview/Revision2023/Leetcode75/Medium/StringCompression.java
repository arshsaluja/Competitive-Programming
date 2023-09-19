class Solution {
    public String compress1(String str) {
        String s= str.charAt(0)+"";
        for(int i=1;i<str.length();i++)
        {
            char ch1=str.charAt(i-1);
            char ch2=str.charAt(i);
            if(ch1!=ch2)
            {
                s+=ch2;
            }
        }
        return s;
    }
    public String compress2(String str) {
        String s= str.charAt(0)+"";
        int count=1;
        for(int i=1;i<str.length();i++)
        {
            char ch1=str.charAt(i-1);
            char ch2=str.charAt(i);
            if(ch1==ch2)
            {
                count++;
            }
            else
            {
                if(count>1){
                s+=count;
                count=1;
                }
                 s+=ch2;
            }
        }
        if(count>1){
                s+=count;
                count=1;
                }
        return s;
    }
    public int compress(char[] chars) {
        int i=0;
        String s= new String(chars);
        compress1(s);
        String st=compress2(s);
        for(char a:st.toCharArray())
        chars[i++]=a;
        return st.length();
    }
}
