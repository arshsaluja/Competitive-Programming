class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(k > n)
        k=k%n;
        int [] ar=new int[n];
        int j=0;

        for(int i=0;i<k;i++)
        {
            ar[i]=nums[n-k+i];
        }
        for(int i=k;i<n;i++)
        {
            ar[i]=nums[j];
            j++;
        }
        System.arraycopy( ar, 0, nums, 0, nums.length );
    }
}
