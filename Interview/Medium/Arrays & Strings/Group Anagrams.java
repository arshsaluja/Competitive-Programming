class Solution {
    public String sortString(String s)
    {
        char a[]=s.toCharArray();
        Arrays.sort(a);
        return new String(a);//return new Sorted string
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res= new ArrayList<>();
        
        Set<String> se=new HashSet<>();
        int n=strs.length;
        String s[]=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=strs[i];
        }
        for(int i=0;i<n;i++)
        {
           strs[i]= sortString(strs[i]);
            se.add(strs[i]);   
        }
        
        for(String i:se)
        {
            List<String> a=new ArrayList<>();
            for(int j=0;j<n;j++)
            { 
                if(strs[j].equals(i))
                {
                    a.add(s[j]);
                }
                
            }
            res.add(a);
        }
        
        
        return res;
    }
}
