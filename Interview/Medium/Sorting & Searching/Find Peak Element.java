class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n<=1)
        {
            return 0;
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(i==0&&nums[i]>nums[i+1])
            {
                c=i;
                break;
            }
            if(i==n-1&&nums[i]>nums[i-1])
            {
                c=i;
                break;
            }
            else
            {
                if(i!=0&&i!=n-1&&nums[i]>nums[i-1]&&nums[i]>nums[i+1])
                {
                    c=i;
                break;
                }
            }
        }
        return c;
    }
}
