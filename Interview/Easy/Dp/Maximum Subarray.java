class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
             if(nums[i]>sum&&sum<0)
                sum=0;
           // if(sum<sum+nums[i])
           // {
               sum=sum+nums[i];
               System.out.println("sum"+sum);
               if(max<sum){
                   
                max=sum;
                   
               // }
               System.out.println("max"+max);
           }
           
        }
        return max;
    }
}

    
