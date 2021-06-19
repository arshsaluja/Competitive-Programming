class Solution {
int nums[];
    // Random obj;
    
    public Solution(int[] nums) {

        this.nums=nums;
       // this.obj=new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
  
    public int[] shuffle() {
        Random obj=new Random();
        int r[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            r[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            int ri=i+obj.nextInt(nums.length-i);
            //swap(nums,i,ri);
            int t=r[ri];
            r[ri]=r[i];
            r[i]=t;
        }
        return r;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
