public class prob28 {
    static int ff(N head)
    {
        N temp1=head;
        int l=0;
        while(temp1!=null)
        {
            l++;
            temp1=temp1.next;
        }
        N a[]=new N[l+1];int i=1;a[0]=head;temp1=head;
        while(temp1.next!=null)
        {
            a[i]=temp1.next;
            temp1=temp1.next;
            i++;
        }
        for(int z=l-1;z>=0;z--)
        {
            System.out.println(a[z].data);
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
       
        ff( head);
    }
}
