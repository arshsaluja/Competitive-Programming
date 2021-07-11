//[1,2,3,4,5]
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i=Integer.MAX_VALUE;int k=Integer.MAX_VALUE;
        int n=nums.length;
        for(int j=0;j<n;j++)
        {
            if(i>=nums[j])
                i=nums[j];
            else if(k>=nums[j])
                k=nums[j];
            else
                return true;
        }
        return false;
    }
}
