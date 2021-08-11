class Solution {
    public List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> cur=new ArrayList<>();
        int n=nums.length;
        boolean visited[]=new boolean[n];
        solve(cur,nums,visited,n);
        return res;
    }
    public boolean solve(List<Integer> cur,int nums[],boolean visited[],int n)
    {
        if(cur.size()==n)
        {
            res.add(new ArrayList(cur));
            return true;
        }
       
            for(int i=0;i<n;i++)
            {
                if(visited[i]) continue;
                cur.add(nums[i]);
                visited[i]=true;
                solve(cur,nums,visited,n);
                cur.remove(cur.size()-1);
                visited[i]=false;
            }
        return false;
    }
}
