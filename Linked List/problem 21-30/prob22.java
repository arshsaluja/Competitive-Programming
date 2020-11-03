
public class prob22 {
    static void ssfind(N h1,N h2)
    {
        N temp1=h1;int c=1;
        while(temp1.next!=null)
        {
         c++;
         temp1=temp1.next;
        }
        N a[]=new N[c];
        int i=1;
        a[0]=h1;
        temp1=h1;
        while(temp1.next!=null)
        {
            a[i]=temp1.next;
         i++;   
         temp1=temp1.next;
        }
        for(int j=0;j<c-1;j++)
        {
  
            for(int k=j+1;k<c;k++)
            {
            if(a[j].data>a[k].data)
            {
               N  temp=a[j];
               a[j]=a[i];
               a[i]=temp;
            }
            }
            
        }
        int l = 0, r = c - 1;  N temp2=h2;int s=0;
        while(temp2.next!=null)
        {
            
        N x=temp2;
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            // Check if x is present at mid 
            if (a[m] == x) 
            {
                s=1;
            break;
        }
  
            // If x greater, ignore left half 
            if (a[m].data < x.data) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
        
        if(s==1)
        {
            System.out.println("The merging point of both the lists found");
           break; 
        }
        temp2=temp2.next;
        }
        
            
        
        
        
    }
   
    public static void main(String args[])
    {
     N node1 = new N();
        N node2 = new N();
        N node3 = new N();
        N node4 = new N();
        N node5 = new N();
        N node6 = new N();
        N node7 = new N();
        node1.data = 1;
        node2.data = 2;
        node3.data = 3;
        node4.data = 4;
        node5.data = 5;
        node6.data = 6;
        node7.data = 7;
        node1.next = node2;
        node2.next = node6;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
       node6.next = node7;
           ssfind(node1,node3);
    }
}
