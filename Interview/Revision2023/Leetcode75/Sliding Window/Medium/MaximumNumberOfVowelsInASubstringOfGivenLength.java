class Solution {
    public int sub(String str)
    {
        int c=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            c++;
        }
        return c;
    }
    public int maxVowels(String s, int k) {
        int r=k-1;int max=0;
        for(int i=0;i<s.length()-k+1;i++)
        {
                String str=s.substring(i,i+k);
                int c=sub(str);
                max=Math.max(max,c);
        }
        return max;
    }
}
