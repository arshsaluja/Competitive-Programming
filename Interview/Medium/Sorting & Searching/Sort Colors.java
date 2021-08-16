class Solution {
    public void sortColors(int[] nums) {
        int i0=0;
        int i1=0;
        int i2=0;
        int n=nums.length;
        
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)i0++;
            else if(nums[i]==1)i1++;
            else if(nums[i]==2)i2++;
        }
        int k=0;
         for(int i=0;i<i0;i++)
        {
            nums[i]=0;
        }
         for(int i=i0;i<i0+i1;i++)
        {
            nums[i]=1;
        }
         for(int i=i0+i1;i<n;i++)
        {
            nums[i]=2;
        }
        
    }
}
