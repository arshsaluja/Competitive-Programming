public class prob24 {
  
    static int middle(N head,N n)
{
      
    N temp1=head;int l=0;
    while(temp1.next!=null)
    {
        l++;
        temp1=temp1.next;
    }
    temp1=head;int p=0;
    for(int i=0;i<l;i++)
    {
        if(n.data==temp1.data)
            p=i;
        temp1=temp1.next;
    }
    int mid=l/2;
    if(mid%2!=0)
    {
        mid--;
    }
    if(p==mid)
    {
        return n.data;
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
node7.data=7;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        N head=node1;
        System.out.println("Yes found"+middle(head,node3));
    
    }
}
