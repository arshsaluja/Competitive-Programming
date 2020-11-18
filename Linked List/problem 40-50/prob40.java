public class prob40 {
    static Noder joscir(Noder head,int m)
    {
        int cnt=1;
            Noder t=head; Noder l=null;
            while(t.next!=t)
            {
                
        while(cnt!=m)
        {
            l=t;
            t=t.next;
            cnt++;
        }
        System.out.println("element deleted is");
        System.out.println(t.data);
       t=t.next;
       l.next=t;
       cnt=1;
        
            }
        return t;
    }
    public static void main(String args[])
    {
        Noder node1 = new Noder();
        Noder node2 = new Noder();
        Noder node3 = new Noder();
        Noder node4 = new Noder();
        Noder node5 = new Noder();
        Noder node6 = new Noder();
        node1.data = 1;
        node2.data = 2;
        node3.data = 3;
        node4.data = 4;
        node5.data = 5;
        node6.data = 6;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node1;
       //node6.next = node1;
       Noder n=joscir(node1,3);
System.out.println("-----One left element is-------");
       System.out.println(n.data);
    }
}
