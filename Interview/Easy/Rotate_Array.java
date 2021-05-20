// [1,2,3,4,5,6,7], k = 3
class Solution {
    public void rotate(int[] nums, int k) {
        int a[]=new int[nums.length];
        int n=nums.length;int f=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i+k>=n)
            {
                f=(i+k)%n;
                a[f]=nums[i];
            }
            else
            {
                a[i+k]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=a[i];
        }
    }
}
