// class du implements Comparable <du>
// {
// int k;int v;
// du(int kk,int vv)
// {
// k=kk;
// v=vv;

// }
// public int compareTo(du t)
// {
// if(v<=t.v)
// return -1;
// else
// return 1;
// }
// }
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
        // PriorityQueue <du> p=new PriorityQueue<du>();
        PriorityQueue <Integer> p=new PriorityQueue<>((n1,n2) -> h.get(n1)-h.get(n2));
        for(int e: h.keySet())
        {
        p.add(e);
            if (p.size() > k) p.poll();
        }
        int res[]=new int[k];
        for(int i=k-1;i>=0;i--)
        {
        res[i]=p.poll();
        }
        //System.out.println(h.get(2));
       return res;
    }
}
