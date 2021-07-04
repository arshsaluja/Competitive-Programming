class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        Set <Character> h=new HashSet<>();
        int l=0;int r=0;int len=0;int max=0;
        while(r<n)
        {
            if(!(h.contains(s.charAt(r))))
            {
                len=r-l+1;
                System.out.println("len  "+len);
                if(len>max)
                {
                    System.out.println("max  "+max);
                    max=len;
                }
                h.add(s.charAt(r));
                r++;
            }
            else
            {
                while(h.contains(s.charAt(r)))
                {
                h.remove(s.charAt(l));
                l++;
                }
            }
        }
        return max;
    }
}
