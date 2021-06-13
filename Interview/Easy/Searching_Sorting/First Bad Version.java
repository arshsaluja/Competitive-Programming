public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s=1;int l=n;
        int mid=1;
        while(s<l)
        {
             mid=s+(l-s)/2;
            if(isBadVersion(mid))
            {
                l=mid;
            }
            else
                s=mid+1;
            
        }
        if(s==l&&isBadVersion(s))
        return s;
        
        return 1;
    }
}
