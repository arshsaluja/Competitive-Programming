public class prob32 {
        static N head;
    static N reverse()
    {
        N p=head,q=null,temp=null;
        head=head.next;
        
        while(true)
        {
        q=p.next;
        temp=q.next;
        q.next=p;
        if(temp==null)
        {
            p.next=null;
            break;
        }
        if(temp.next==null)
        {
            p.next=temp;
            break;
        }
        p.next=temp.next;
        p=temp;
    }
        return head;
    }
    static void insert(int data)
{
//Create new node
    N node=new N();
    node.data=data;
    node.next=null;//optional as its always null
    if(head==null)
        head=node;
    else
    {
        //temp node to traverse
        N n=head;
        while(n.next!=null)
        {
            n=n.next;
        }
        n.next=node;
    }
}
    static void show()
    {
        N n=reverse();
        while(n.next!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
        System.out.println(n.data);
    }
    public static void main(String args[])
    {
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        insert(6);
        show();
    }
    
}
