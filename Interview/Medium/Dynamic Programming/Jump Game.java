class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        if(nums[0]==0&&n>=2)
            return false;
        int temp=0;
        for(int i=0;i<n;i=i+temp)
        {
            if(i==n-1)
                return true;
            if(nums[i]==0)
                return false;
            temp=nums[i];
        }
       return true; 
    }
}
