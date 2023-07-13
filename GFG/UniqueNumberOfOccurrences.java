class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        Arrays.sort(arr);
        
        int c=arr[0];int t=0;
        TreeSet t1 = new TreeSet(); 
        TreeSet t2 = new TreeSet(); 
        for(int i=0;i<n;i++)
        {
            if(c!=arr[i])
            {
                t2.add(t);
                t=0;
                c=arr[i];
            }
            if(c==arr[i])
            {
                t++;
            }
            t1.add(arr[i]);
            
        }
        t2.add(t);
        if(t1.size()==t2.size())
        return true;
        else
        return false;
    }
}
        
