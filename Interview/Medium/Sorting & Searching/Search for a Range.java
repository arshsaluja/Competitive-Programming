class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int res[]=new int[2];
        res[0]=-1;
        res[1]=-1;
        if(nums.length<=0) return res;
     int s=nums[0];
        int l=nums[1];
        if(target<s||target>l) return res;
        int mid=n/2;int a=0;int b=0;
        while(s<=l)
        {
            if(nums[mid]>target)
                l=mid-1;
            else if(nums[mid]<target)
                s=mid+1;
            else
            {
                if(nums[s]<target)
                    s++;
                if(nums[l]>target)
                    l--;
                 else if(nums[s]==target&&nums[l]==target)
                 {
                     res[0]=s;
                     res[1]=l;
                    return res;
                 }
             }
        }
        return res;
    }
}
