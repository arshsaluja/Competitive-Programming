// Input: n = 19
// Output: true
// Explanation:
// 12 + 92 = 82
// 82 + 22 = 68
// 62 + 82 = 100
// 12 + 02 + 02 = 1
class Solution {
    public boolean isHappy(int n) {
        
        Set <Integer> s=new HashSet<Integer>();
        while(s.add(n))
        {
        int sum=0;
        while(n>0)
        {
            int c=n%10;
            int sq=c*c;
             sum+=sq;
            n=n/10;
        }
            if(sum==1)
                return true;
            
            n=sum;
        }
        return false;
    }
}
