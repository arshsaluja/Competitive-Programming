public class prob52 {
    static N eve_odd(N head)
    {
        N temp=head;N c=null,h=null,ho=null,b=null,te=null;
        while(temp!=null)
        {
            if(temp.data%2==0)
            {
                if(h==null)
                {
                    c=temp;
                    h=c;
                   temp=temp.next;
                }
                else{
                c.next=temp;
                c=c.next;
                temp=temp.next;
                }
                
            }
            else{
            if(ho==null)
            {
                b=temp;
                ho=b;
                temp=temp.next;
            }
            else{
                
                b.next=temp;
                b=b.next;
                temp=temp.next;
                
                }
            }
        }
        b.next=null;
        c.next=ho;

        return h;
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
        node4.next= node5;
        node5.next = node6;
       // node6.next = node7;
         N n=eve_odd(node1);
        
    while(n.next!=null)
    {
        System.out.println(n.data);
        n=n.next;
    }
        System.out.println(n.data);//for last element
       
}
}
