class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int l=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>l)
                l=nums[i];
                
        }
        System.out.println("l: "+l);
        int c=0;
        for(int i=0;i<n;i++)
        {
           if(nums[i]==1)
           {
               c=i;
               System.out.println("c: "+c);
               break;
           }
        }
        int o=0;
        for(int i=1;i<=l;i++)
        {
            if(nums[c++]!=i)
            {
                System.out.println("o: "+o);
                o=i;
                break;
            }
                
        }
        if(o==0)
            return l+1;
     return o;   
    }
}
