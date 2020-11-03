public class prob31 {
    static N mergesorted(N head1,N head2)
    {
        N temp1=null;
        while(head1!=null&&head2!=null)
        {
        if(head1.data<=head2.data)
        {
            temp1=head1;
            temp1.next=head1.next;
            head1=head1.next;
        }
        else
        {
            temp1=head2;
            temp1.next=head2.next;
            head2=head2.next;
        }
        }
        
        
        return temp1;
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
        //node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        N head=node1;
        N t=mergesorted(node1,node4);
        while(t.next!=null)
        {
            System.out.println(t.data);
            t=t.next;
        }
        System.out.println(t.data);
    }
}
