// Input: nums = [10,9,2,5,3,7,101,18]
// Output: 4
// Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;int max=0;
        for(int i=0;i<n;i++)
        {
         int c=1;ArrayList<Integer> a=new ArrayList<>();
         a.add(nums[i]);
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]<nums[j]&&nums[j-1]<nums[j]&&nums[j]<a.get(c))
                {
                    a.add(nums[j]);
                    c++;
                }
            }
         if(c>max)
             max=c;
        }
        return max;
    }
}
