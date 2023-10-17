class Solution {
    public boolean closeStrings(String word1, String word2) {
        int s1=word1.length();
        int s2=word2.length();
        if(s1!=s2) return false;
        Set <Character> s1=new HashSet<>();
        Set <Character> s2=new HashSet<>();
        

        for(int i=0;i<s1;i++){
                if(ar1[i]!=ar2[i]) return false;
        }

        return true;
    }
}
