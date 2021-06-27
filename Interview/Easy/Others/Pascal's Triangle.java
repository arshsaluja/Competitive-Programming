class Solution {
    public List<List<Integer>> generate(int n) {
     List<List<Integer>> res=new ArrayList <List<Integer>>(); 
    List <Integer> p=new ArrayList<>();
        p.add(1);
       res.add(p);
        for(int i=1;i<n;i++)
        {
             List <Integer> prev =res.get(i-1);
            List <Integer> a=new ArrayList<>();
            a.add(1);
        for(int j=1;j<i;j++)
        {
            a.add(prev.get(j-1)+prev.get(j));
        }
            a.add(1);
           res.add(a);
        }
        return res;
    }
}
