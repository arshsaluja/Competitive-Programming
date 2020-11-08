public class prob50 {
    static N merll(N h1,N h2)
    {
        N head1=null;N temp=null;
        while(h1!=null&&h2!=null)
        {
        if(head1==null)
        {
            temp=h1;
            h1=h1.next;
            temp.next=h2;
            h2=h2.next;
            head1=temp;
            temp=temp.next;
        }
        else
        {
            temp.next=h1;
            h1=h1.next;
            temp=temp.next;
            temp.next=h2;
            h2=h2.next;
            temp=temp.next;
        }
        }
        if(h1!=null)
        {
            while(h1!=null)
            {
            temp.next=h1;
            h1=h1.next;
            temp=temp.next;
            }
        }
              if(h2!=null)
        {
            while(h2!=null)
            {
            temp.next=h2;
            h2=h2.next;
            temp=temp.next;
            }
        }
        return head1;
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
        N node8 = new N();
        node8.data = 8;
        node1.data = 1;
        node2.data = 2;
        node3.data = 3;
        node4.data = 4;
        node5.data = 5;
        node6.data = 6;
node7.data=7;
        node1.next = node2;
        node2.next = node3;
        node3.next= node4;
        node4.next= node8;
        node5.next = node6;
        node6.next = node7;
         N n=merll(node1,node5);
        
    while(n.next!=null)
    {
        System.out.println(n.data);
        n=n.next;
    }
        System.out.println(n.data);//for last element
    }
}
