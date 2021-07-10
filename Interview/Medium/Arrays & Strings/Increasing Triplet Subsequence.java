class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        if(n<3) return false;
       int lm[]=new int[n];//smallest ele
        int rm[]=new int[n];//largest ele
        lm[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            lm[i]=Math.min(lm[i-1],nums[i]);
            System.out.println("lm"+lm[i]);
        }
        rm[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rm[i]=Math.max(rm[i+1],nums[i]);
             System.out.println("rm"+rm[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(lm[i]<nums[i]&&nums[i]<rm[i])
                return true;
        }
        return false;
    }
}
