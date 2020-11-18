public class prob38 
{
    static N reverse(N head)
    {
        N newnode=null,temp=null;
        while(head!=null)
        {
        newnode=head.next;
        head.next=temp;
        temp=head;
        head=newnode;
        }
        
        return temp;
        
    }
    static N kwiseswap(int k,N head)
    {
       N p=head;
       N q=head;
       N ns=null;
       N temp=null;int cnt=1;
       while(cnt!=k)
       {
           if(q==null)
               return p;
           //System.out.println(q.data);
           
           p=p.next;
           cnt++;
       }
        //System.out.println(ns.data);
        ns=p;
        q=ns;
        while(true)
        {
            p=head;
            temp=q.next;
            if(temp==null)
            {
                reverse(p);
                return ns;
            }
            q.next=null;
            q=temp;
            head=temp;
            cnt=1;
            while(cnt!=k)
            {
                if(temp.next==null)
                {
                    reverse(p);
                    p.next=q;
                    return(ns);
                }
                temp=temp.next;
                cnt++;
            }
            reverse(p);
            p.next=temp;
            q=temp;
        }
        
        return ns;
        
    }
      
    public static void main(String args[])
    {
        N n1=new N();
        N n2=new N();
        N n3=new N();
        N n4=new N();
        N n5=new N();
        N n6=new N();
        N n7=new N();
        N n8=new N();
        N n9=new N();
        N n10=new N();
        n1.data=1;
        n2.data=2;
        n3.data=3;
        n4.data=4;
        n5.data=5;
        n6.data=6;
        n7.data=7;
        n8.data=8;
        n9.data=9;
        n10.data=10;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=n8;
        n8.next=n9;
        n9.next=n10;
        N h=kwiseswap(2,n1);
        while(h!=null)
        {
            System.out.println(h.data);
            h=h.next;
        }
        System.out.println(h.data);
        
    }
}
