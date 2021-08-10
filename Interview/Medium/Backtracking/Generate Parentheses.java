class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> m=new ArrayList<>();
        pp(m,"",0,0,n);
        return m;
    }
    public void pp(List<String> m,String s,int open,int close,int max)
    {
        if(s.length()==max*2)
        {
            m.add(s);
            return ;
        }
        if(open<max)pp(m,s+"(",open+1,close,max);
        if(close<open)pp(m,s+")",open,close+1,max);
    }
}
