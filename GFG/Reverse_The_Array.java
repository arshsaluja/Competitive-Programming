class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        String s="";
        int n=str.length();
        for(int i=n-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            s=s+ch;
        }
        return s;
    }
}
