class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int next=n+1;
        for(int i=0;i<n;i++){if(nums[i]<=0||nums[i]>n) nums[i]=next;}
        
        for(int i=0;i<n;i++){
            int num=Math.abs(nums[i]);
            if(num== next) continue;
            num--;
            if(nums[num]>0){
                nums[num]*=-1;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>=0) return i+1;
        }
        return next;
    }
}
