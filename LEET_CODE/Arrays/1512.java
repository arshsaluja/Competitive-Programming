class Solution {
    public int numIdenticalPairs(int[] nums) {
     int a[]=new int[101];int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            a[nums[i]]++;
        }
        for(int i=0;i<101;i++)
        {//if(a[i]>=1)
            sum+=((a[i]-1)*a[i])/2;
        }
        return sum;
    }
}
