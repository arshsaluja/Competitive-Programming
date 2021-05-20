class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int a[]=new int[n1+n2];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;int j=0;int k=0;
        while(i<n1&&j<n2)
        {
            if(nums1[i]<nums2[j])
                i++;
            else if(nums1[i]>nums2[j])
                j++;
            else
            {
                a[k++]=nums1[i];
                i++;
                j++;
            }
                
        }
        return Arrays.copyOfRange(a,0,k);
        
    }
}
