class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;int c=0;
        for(int i=0;i<n;i++)
        {
         if(i!=0&&intervals[i][0]<intervals[i-1][1])
             c++;
        }
        int d=n-c;int t=0;
        int [][]res=new int[d][2];int s=0;int e=0;
        for(int i=0;i<n;i++)
        {
         while(i!=0&&intervals[i][0]<intervals[i-1][1])
         {
             e=intervals[i][1];
             s=intervals[i-1][0];
         }
            res[t][0]=s;
            res[t][1]=e;
            t++;
        }
        return res;
        
    }
}
