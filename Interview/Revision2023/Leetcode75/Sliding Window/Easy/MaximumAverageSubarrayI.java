class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double avg=Integer.MIN_VALUE;
        if(k==1 && n==1) avg=nums[0];
     for(int i=0;i<n-k+1;i++)
     {
         int t=0,sum=0;
         while(t<k)
         {
             sum+=nums[i+t];
             t++;
         }
         double average=(double)sum/k;
         avg=Math.max(avg,average);
     } 
       return avg;
    }
}
