class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap <Integer,Integer> a1=new HashMap<>();
         HashMap <Integer,Integer> a2=new HashMap<>();
        List <Integer>a=new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++)
        {
            if(a1.containsKey(nums1[i]))
                a1.put(nums1[i],(a1.get(nums1[i])+1));
            else
                a1.put(nums1[i],1);
        }
        for(int i=0;i<nums2.length;i++)
        {
           if(a2.containsKey(nums2[i]))
                a2.put(nums2[i],(a2.get(nums2[i])+1));
            else
                a2.put(nums2[i],1); 
        }int k=0;int x=0;
        for(Integer o:a1.keySet())
        {
            if(a2.containsKey(o))
                 x=Math.min(a1.get(o),a2.get(o));
            while(x-- >0)
            {
                a.add(o);
            }
        }
        int res[]=new int[a.size()];
        for(int in:a)
        {
            res[k++]=in;
        }
        return res;
        
    }
}
