public class prob46 {
    static N modular(N head,int k)
    {
        N temp=head;
         N got=null;
        int i=0;
        while(temp!=null)
        {
            if(i%k==0)
            {
              got=temp;
            }
            i++;
            temp=temp.next;
        }
            System.out.print("We got the element present is -- ");
            System.out.print(got.data);
        
        
        
        
        return head;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
        int k= sc.nextInt();
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
        node6.next = node7;
        modular(node1,k);
    }
}
