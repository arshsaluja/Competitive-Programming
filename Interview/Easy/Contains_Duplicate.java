class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> m =new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            m.add(nums[i]);
        }
        if(nums.length==m.size())
            return false;
        else 
            return true;
    }
}
