import java.util.*;
public class prob53 {
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
    static N sum2ll(N h1,N h2)
    {
        N sum=null;N a=h1;N b=h2;int i=0;int j=0;int ij=0;
        while(h1!=null)
        {
            i++;
            h1=h1.next;
        }
        while(h2!=null)
        {
            j++;
            h2=h2.next;
        }
        h1=a;h2=b;
        if(i>=j)
        {
            ij=i-j;
            while(ij!=0)
            {
                N newn=null;
                newn.next=h1;
                h1=newn;
                ij--;
            }
        }
        else if(i<=j)
        {
            ij=j-i;
            while(ij!=0)
            {
                N newn=null;
                newn.next=h2;
                h2=newn;
                ij--;
            }
        }
        N rh1=reverse(h1);
        N rh2=reverse(h2);int div=0;int carry=0;int rem=0;int add=0;
        while(h1!=null&&h2!=null)
        {
            int one=h1.data;
            int two=h2.data;
            add=one+two;
           
           N h.data=add.data;
           N head=null;
           if()
            h=h.next;
            
            div=add/10;
            if(div/10!=0)
            {
                rem=div%10;
                carry=div;
            }
            if(carry!=0)
            {
                
            }
        }
              return sum;
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
       
        
    }
}
