class Solution {
    public int maxOperations(int[] nums, int k) {
        int operation=0;
        for(int i=0;i<nums.length;i++)
        {
        for(int j=i+1;j<nums.length;j++)
        {
            if(nums[i]!=0&&nums[j]!=0&&nums[i]+nums[j]==k){
                nums[i]=0;
                nums[j]=0;
            operation++;
            }
        }
        }
        return operation;
    }
}
