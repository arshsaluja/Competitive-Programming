public class prob35 {
    static N print(N head)
    {
        N start=head;
        
        while(head.next!=start)
        {
            System.out.println(head.data);
            head=head.next;
        }
         System.out.println(head.data);
        return head;
    }
    static void split(N head)
    {
        N a=head;int c=1;
        while(a.next!=head)
        {
            c++;
            a=a.next;
        }
        N last=a;N t=null;N y=null;
        N b=head;N l=null;N h1=null;
            for(int i=0;i<c/2;i++)
            {
                l=b;
                b=b.next;
            }
            t=b;
            l.next=head;
            System.out.println("First half is-");
            print(head);
             h1= t;
             
           while(t!=head)
           {
               y=t;
               t=t.next;
           }
           y.next=h1;
            System.out.println("Second half is-");
           print(h1);
       
    }
    public static void main(String args[])
    {
        N n1=new N();
        N n2=new N();
        N n3=new N();
        N n4=new N();
        N n5=new N();
        n1.data=4;
        n2.data=5;
        n3.data=7;
        n4.data=40;
        n5.data=2;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n1;
        split(n1);
        
    }
}
