class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> r=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        int i=0;
        solve(r,res,nums,i);
        return res;
            
    }
    public void solve( List<Integer> r,List<List<Integer>> res,int[] nums,int i)
    {
        if(i==nums.length)
        {
            res.add(new ArrayList<>(r));
            return ;
        }
        r.add(nums[i]);
        solve(r,res,nums,i+1);
        r.remove(r.size()-1);
        solve(r,res,nums,i+1);
    }
    
}
