class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i=0;int j=1;int k=n-1;int n=nums.length;
        for(int t=1;t<n-1;t++)
        {
            if(k<=n-1&&i<j&&j<k&&nums[i]<nums[j]&&nums[j]<nums[k])
            {
                return true;
            }
            i++;
            j++;
            k--;
        }
        
        return false;
    }
}
