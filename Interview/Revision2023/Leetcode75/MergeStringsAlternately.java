class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;StringBuilder str = new StringBuilder();
        while(i<word1.length()||i<word2.length())
        {
            if(i<word1.length())
            str.append(word1.charAt(i));
            if(i<word2.length())
            str.append(word2.charAt(i));
            i++;
        }
        
        return str.toString();
    }
}
