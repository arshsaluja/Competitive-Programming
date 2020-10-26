
//Find nth node from the end of a Linked List in O(n) Complexity
class Nodes
{
    int data;
    Nodes next;
}
class find
 {
     Nodes head;
    public void insert(int data)
{
//Create new node
    Nodes node=new Nodes();
    node.data=data;
    node.next=null;//optional as its always null
    if(head==null)
        head=node;
    else
    {
   //temp node to traverse
        Nodes no=head;
        while(no.next!=null)
        {
            no=no.next;
        }
        no.next=node;
    }
}
    public void show()
{
    Nodes n=head;//temp node to traverse
    while(n.next!=null)
    {
        System.out.println(n.data);
        n=n.next;
    }
        System.out.println(n.data);//for last element
    
}
     public int finding(int n)
     {
         Nodes temp=head;
         Nodes temp1=head;
         int count=0;
         while(temp.next!=null)
         {
             temp=temp.next;
             count++;
         }
         int w=count-n;
         for(int i=0;i<=count;i++)
         {
             if(i==w)
             {
                 System.out.println("found");
                 
                 return temp1.data;
             }   
                 temp1=temp1.next;
             
         }
         
         
     return 0;
     }
}
public class findnthnode {
    public static void main(String args[])
    {
        find obj=new find();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(5);
        obj.show();
        System.out.println(obj.finding(2));
        
    }
        
    }
