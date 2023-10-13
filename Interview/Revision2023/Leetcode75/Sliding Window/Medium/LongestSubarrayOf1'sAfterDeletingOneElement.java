class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;int j=0;int k=1;
        while(j<nums.length)
        {
            if(nums[j]==0)
            k--;
            if(k<0)
            {
                if(nums[i]==0)
                k++;
            i++;

            }
            j++;
        }
        return j-i-1;
    }
}
