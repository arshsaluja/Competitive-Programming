class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[]=new int[2];
        res[0]=find_s(nums,target);
        res[1]=find_l(nums,target);
        return res;
    }
    int find_s(int[] nums, int target)
    {
        int index=-1;
        int s=0;int l=nums.length-1;
        while(s<=l)
        {
            int mid=s+(l-s)/2;
            if(nums[mid]>=target)
                l=mid-1;
            else if(nums[mid]<=target)
                s=mid+1;
            if(nums[mid]==target) index=mid;
        }   
        return index;
    }
    int find_l(int[] nums, int target)
    {
        int index=-1;
        int s=0;int l=nums.length-1;
        while(s<=l)
        {
            int mid=s+(l-s)/2;
            
            if(nums[mid]<=target)
                s=mid+1;
            else
                l=mid-1;
            if(nums[mid]==target) index=mid;
        }   
        return index;
    }
}
