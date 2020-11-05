public class prob31 {
    static N mergesorted(N h1,N h2)
    {
        N temp=new N();N head=temp;
        while(true)
        {
     if(h1==null)
     {
         head.next=h2;
         break;
     }
     
     if(h2==null)
     {
          head.next=h1;
         break;
         
     }
     
         if(h1.data<=h2.data)
         {
          head.next=h1;
    
          h1=h1.next;
         }
         else if(h1.data>=h2.data)
         {
             head.next=h2;
            
             h2=h2.next;
         }
         head=head.next;
    }
     return temp.next;
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
        while(t!=null)
        {
            System.out.println(t.data);
            t=t.next;
        }
        System.out.println(t.data);
    }
}
