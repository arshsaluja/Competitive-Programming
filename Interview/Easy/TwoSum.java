class Solution {
    public int[] twoSum(int[] nums, int target) {
        int r[]=new int[2];
        int f=0;
         for(int j=0;j<nums.length;j++)
        {
            if(f==1)
                break;
        for(int i=j+1;i<nums.length;i++)
        {
            if(nums[i]+nums[j]==target)
            {
                r[0]=j;
                r[1]=i;
                f=1;
                break;
            }
        }
         }
        return r;
    
    }
}
