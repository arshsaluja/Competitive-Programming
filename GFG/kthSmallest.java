
public static int kthSmallest(int[] a, int l, int r, int k) 
{ 
    //Your code here
    //int a[]=sort(arr);
    int n=a.length;int temp=0;//int c=0;
    for(int i=0;i<n-1;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                
            }
            
            
        }
    }
    
    return a[k-1];
    
} 
//https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1#
