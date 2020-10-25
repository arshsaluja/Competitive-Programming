class Nodee
{
    int data;
    Nodee left;
    Nodee right;
}
class double1
{
Nodee head;
     //insert at start
    public void inserAtstart(int data)
    {
        Nodee n=new Nodee();
        n.data=data;
        n.right=null;
        n.left=null;
        n.right=head;
        n.right.left=n;
        head=n;
    }
    //insert at mid
    public void insertAtmid(int index,int data)
    {
         Nodee n=new Nodee();
        n.data=data;
        n.right=null;
        n.left=null;
        Nodee temp=head;
        for(int i=0;i<index;i++)
        {
            temp=temp.right;
        }
        temp.right.left=n;
        
        n.right=temp.right;
        temp.right=n;
        n.left=temp;
    }
//insert at last
    public void insert(int data)
    {
        Nodee n=new Nodee();
        n.data=data;
        n.right=null;
        n.left=null;
        Nodee temp=head;
        if(head==null)
        {
            head=n;
        }
        else
        {
            
            while(temp.right!=null)
                {
                temp=temp.right;
                }
            n.left=temp;
            temp.right=n;   
        }
    }
    public void show()
    {
        Nodee n=head;
        while(n.right!=null)
        {
            System.out.println(n.data);
            n=n.right;
        }
        System.out.println(n.data);
    }
}
public class DoublyLinkedList {
 public static void main(String args[])
 {
     double1 obj=new double1();
     obj.insert(1);
     obj.insert(2);
     obj.insert(3);
     obj.insert(4);
  
     
     obj.inserAtstart(0);
     obj.insertAtmid(2, 23);
     obj.show();
     
 }
}
