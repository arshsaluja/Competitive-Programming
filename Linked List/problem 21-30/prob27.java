public class prob27 {
    static int op(N head)
    {
        N temp1=head,temp2=head;
        int i=0;
        while(temp1.next!=null)
        {
            if(i==0)
            {
                temp1=temp1.next;
                i=1;
            }
            else if(i==1)
            {
                temp1=temp1.next;
                temp2=temp2.next;
                i=0;
            }      

        }
        return temp2.data;
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
        System.out.println("Yes found in O(N)"+op(head));
    
    }
    
}
