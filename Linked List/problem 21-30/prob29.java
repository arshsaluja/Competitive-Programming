public class prob29 {
    //Check whether the given Linked List length is even or odd?
    static void mm(N head)
    {
        N temp1=head;
        while(temp1.next!=null)
        {
            temp1=temp1.next.next;
        }
        if(temp1.next==null)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("even");
        }
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
        mm( head);
    }
}
