//[nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        
        int  n=nums.length;
       // if(n<=1) return res;
        // int l=0;int h=0;int sum=0;
        for(int i=0;i<n-2;i++)
        {
         if(i==0||(i>0&&nums[i]!=nums[i-1]))
            {     
             int l=i+1;
            int h=n-1;
            int sum=0-nums[i];
            
 
            while(l<h)
            {
                
                if(nums[l]+nums[h]==sum)
                {
                    List <Integer> a=new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[l]);
                    a.add(nums[h]); 
                    res.add(a);
                
                
                while(l<h&& nums[l]==nums[l+1]) l++;
                while(l<h&& nums[h]==nums[h-1]) h--;
               l++;
                h--;
            }
         
            else if(nums[l]+nums[h]<sum) l++;
            else h--;
         }
         }  
            
        }
        return res;
    }
}
