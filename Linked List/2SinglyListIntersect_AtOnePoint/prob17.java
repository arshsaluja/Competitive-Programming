public class probl17 {
     static int findr(N h1,N h2)
    {
        N temp1=h1;
        while(temp1.next!=null)
        {
            N t=temp1;N temp2=h2;
            while(temp2.next!=null)
            {
                if(t.next==temp2.next)
                {
                    System.out.println("Found");
                    return t.next.data;
                   
                }
                
                temp2=temp2.next;
                
            }
            temp1=temp1.next;
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
        node7.data = 7;
        node1.next = node2;
        node2.next = node6;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
       node6.next = node7;
        System.out.println(findr(node1,node3));

    
    }
}
