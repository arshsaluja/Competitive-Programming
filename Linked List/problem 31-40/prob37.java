public class prob37 {
    static N rev(N head)
    {
        N n=null;N temp=null;
        while(head!=null)
        {
        n=head.next;
        head.next=temp;
        temp=head;
        head=n;
        }
        
        return temp;
    }
    static boolean palin(N head)
    {
        N a=head;int c=1;
        while(head!=null)
        {
            c++;
            head=head.next;
        }
        head=a;
        N t1=head;N l=null;int v=0;
       
        for(int i=0;i<c/2;i++)
        {
            l=t1;
            t1=t1.next;
        }
        
         if(c%2!=0)
        {
             t1=t1.next;
        }
         N ip=rev(t1);
        for(int i=0;i<c/2-1;i++)
        {
            if(a.data==ip.data)
            {
                v++;
            }
            else
                return false;
            a=a.next;
            ip=ip.next;
        }
        return v==c/2-1;
    }
    public static void main(String args[])
    {
        N n1=new N();
        N n2=new N();
        N n3=new N();
        N n4=new N();
        N n5=new N();
        n1.data=1;
        n2.data=2;
        n3.data=10;
        n4.data=2;
        n5.data=1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        if(palin(n1)==true)
            System.out.println("Yes the given string is Palindrone");
        else
            System.out.println("No the given string is NOT Palindrone");
    }
}
