class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==1) return 0;

        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            int l=i;int r=i;int lsum=0;int rsum=0;
            for(int j=0;j<i;j++)
            {
                lsum+=nums[j];
                k++;
            }
            for(int j=i+1;j<nums.length;j++)
            {
                rsum+=nums[j];
                k++;
            }
            if(lsum==rsum&&k>0) return i;
        }
        return -1;
    }
}
