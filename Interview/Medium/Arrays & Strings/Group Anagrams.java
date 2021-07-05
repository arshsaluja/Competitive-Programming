class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h=new HashMap<>();
        List<List<String>> b=new ArrayList<>();
                
        for(int i=0;i<strs.length;i++)
        {
         char ch[]= strs[i].toCharArray();
            Arrays.sort(ch);
            String s=String.valueOf(ch);
            if(!h.containsKey(s))
            {
                h.put(s,new ArrayList<>());
            }
            h.get(s).add(strs[i]);
                
        }
        b.addAll(h.values());
        return b;

    }
}
