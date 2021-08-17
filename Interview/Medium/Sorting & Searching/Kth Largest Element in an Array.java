class du implements Comparable <du>
{
int k;int v;
du(int kk,int vv)
{
k=kk;
v=vv;

}
public int compareTo(du t)
{
if(v<=t.v)
return -1;
else
return 1;
}
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> h=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!h.containsKey(nums[i]))
            h.put(nums[i],1);
            else
               h.put(nums[i],h.get(nums[i])+1); 
        }
        PriorityQueue <du> p=new PriorityQueue<du>();
        for(Map.Entry<Integer,Integer> e: h.entrySet())
        {
        p.add(new du(e.getKey(),e.getValue()));
        }
        int res[]=new int[k];
        for(int i=0;i<k;i++)
        {
        res[i]=p.poll().v;
        }
        
       return res;
    }
}
