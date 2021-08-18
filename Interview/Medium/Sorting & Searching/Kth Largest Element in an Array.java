class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        int n=nums.length;
        for(int i=0;i<k;i++)
        {
            p.add(nums[i]);
        }
        for(int i=k;i<n;i++)
        {
            if(p.peek()<nums[i])
            {
                p.poll();
                p.add(nums[i]);
            }
           
        }
        return p.poll();
        
    }
}
