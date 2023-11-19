class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
//         Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
// Output: [3,3,5,5,6,7]
// Explanation: 
// Window position                Max
// ---------------               -----
// [1  3  -1] -3  5  3  6  7       3
//  1 [3  -1  -3] 5  3  6  7       3
//  1  3 [-1  -3  5] 3  6  7       5
//  1  3  -1 [-3  5  3] 6  7       5
//  1  3  -1  -3 [5  3  6] 7       6
//  1  3  -1  -3  5 [3  6  7]      7
        int n=nums.length;
        int res[]=new int [n-k+1];int t=0;
        
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            if((!q.isEmpty())&& q.peek()==i-k) q.poll();
            while((!q.isEmpty())&& nums[q.peekLast()]<=nums[i]) q.pollLast();
            q.offer(i);
            if(i>=k-1) res[t++]=nums[q.peek()];
        }
        
        return res;
    }
}
