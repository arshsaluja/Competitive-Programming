
//User function template for Java

public static void sort012(int a[], int n){
    // code here 
    int lo=0;int hi=n-1;int mid=0;int temp=0;
    while(mid<=hi)
    {
        switch(a[mid])
        {
            
            case 0:
                temp=a[lo];
                a[lo]=a[mid];
                a[mid]=temp;
                lo++;
                mid++;
                break;
            case 1:
                mid++;
                break;
            case 2:
                temp=a[mid];
                a[mid]=a[hi];
                a[hi]=temp;
                hi--;
                break;
        }
    }
    
}
