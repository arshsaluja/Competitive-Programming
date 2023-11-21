class Solution {
    public String minWindow(String s, String t) {
        int l=0;int r=0;
        int t1=t.length();
//         Input: s = "ADOBECODEBANC", t = "ABC"
// Output: "BANC"
// Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
        HashMap<Character,Integer> th=new HashMap<>();
        HashMap<Character,Integer> sh=new HashMap<>();
        for(int i=0;i<t1;i++){
            th.put(t.charAt(i),th.getOrDefault(t.charAt(i),0)+1);
        }
        System.out.println(th);
        while(l<=s.length()){
            sh.put(s.charAt(l),sh.getOrDefault(s.charAt(l),0)+1);
        }
        return "";
    }
}
