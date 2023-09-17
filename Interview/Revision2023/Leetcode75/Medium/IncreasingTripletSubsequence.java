class Solution {
    //[1,2,3,4,5]
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        int i=Integer.MAX_VALUE,k=Integer.MAX_VALUE;
        for(int j=0;j<n;j++)
        {
           if(i>=nums[j])
           i=nums[j];
           else if(k>=nums[j])
           k=nums[j];
           else return true;
        }
        return false;
    }
}
