class Solution {
    public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int l=0;
        int r=height.length-1;
        while(l<r)
        {
            max=Math.max(max,(r-l)*Math.min(height[r],height[l]));
            if(height[l]<height[r])
            l++;
            else
            r--;

        }
        return max;
    }
}
