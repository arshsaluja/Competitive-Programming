class Solution {
    public int maxVowels(String s, int k) {
        List<Character> vw=Arrays.asList('a','e','i','o','u');
        Set<Character> vowels=new HashSet<Character> (vw);
        int vcnt=0;
        for(int i=0;i<k;i++)
        {
            if(vowels.contains(s.charAt(i))) vcnt++;
        }
        int l=0;int r=k-1;int maxvcnt=vcnt;
        while(r<s.length()-1)
        {
            if(vowels.contains(s.charAt(l))) vcnt--;
            l++;
            r++;
            if(vowels.contains(s.charAt(r))) vcnt++;
            maxvcnt=Math.max(maxvcnt,vcnt);
        }
        return maxvcnt;
    }
}
