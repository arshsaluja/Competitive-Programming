public class prob21 {
    static int findm(int n,N h1,N h2)
    {
        
        N a[]=new N[n];
        N temp1=h1;
        N temp2=h2;
        a[0]=h1;
        a[1]=h2;
        int i=2;
        while(temp1.next!=null)
        {
            
            a[i]=temp1.next;

            temp1=temp1.next;
            i++;
            
        }
        while(temp2.next!=null)
        {
            a[i]=temp2.next;

            temp2=temp2.next;
            i++;
        }
        for(int j=0;j<n-1;j++)
        {
            N t=a[j];N b=a[j+1];
            if(t==b)
            {
                System.out.println("The merging point of both the lists found");
                return 1;
            }
            
        }
        return 0;
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
        
       findm(19 ,node1,node3);
    }
}
