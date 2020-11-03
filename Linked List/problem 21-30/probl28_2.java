public class probl28_2 {
    static N hh(N head)
    {
        N temp1=null;N t=null;
        while(head.next!=null)
        {
            temp1=head.next;
            head.next=t;
            t=head;
            head=temp1;
        }System.out.println(head.data);
        return t;
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
       
        N t=hh(head);
        
        while(t.next!=null)
        {
            System.out.println(t.data);
            t=t.next;
        }
        System.out.println(t.data);
    }
}
