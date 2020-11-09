public class prog43 {
    
    static N func(N head,N x)
    {
        N temp=head,prev=null,forw=null;N del=null;
        int c=0;N h=head;
        while(temp!=null)
        {
            if(temp==x)
            {
                del=temp;
                temp=temp.next;
                h=temp;
                del.next=null;
                c++;
            }
            else if(temp.next==x)
            {
                del=temp.next;
                prev=temp;
                forw=temp.next.next;
                temp.next=forw;
                c++;
                break;
            }
            temp=temp.next;
        }
        
        if(c!=1)
        {
            System.out.println("Sorry this element does not exist in the l.l..\n Enter the valid element");
        }
        else
        {
            System.out.println("The element deleted is-");
            System.out.println(del.data);
        }
       return h;
    }
    public static void main(String args[])
    {
        N node2 = new N();
        N node3 = new N();
        N node4 = new N();
        N node5 = new N();
        N node6 = new N();
        N node7 = new N();
        N node8 = new N();
        node8.data = 8;
        //node1.data = 1;
        node2.data = 2;
        node3.data = 3;
        node4.data = 4;
        node5.data = 5;
        node6.data = 6;
node7.data=7;
        //node1.next = node2;
        node2.next = node3;
        node3.next= node4;
        node4.next= node5;
        node5.next = node6;
        node6.next = node7;
        N head=node2;
        
        N n=func(head,node2);
         while(n.next!=null)
    {
        System.out.println(n.data);
        n=n.next;
    }
        System.out.println(n.data);//for last element
    }
}
