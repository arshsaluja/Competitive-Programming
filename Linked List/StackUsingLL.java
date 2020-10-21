
class Node
{
    int data;
    Node next;
}
class Stacks
{
    Node top=null;
    public boolean isEmptys()
    {
        return top== null;
    }
    public void pushs(int data)
    {
            Node node=new Node();
            node.data=data;
            node.next=null;
            Node n=null;
            if(node==null)
                System.out.println("overflow");
         n=node;
         node.next=top;
         top=n; 
     
    }
    public void pops()
    {
        if(top== null)
            System.out.println("underflow");
        top=top.next;
    }
    public void peeks()
    {
        if(!isEmptys())
            System.out.println( top.data);
        else
            System.out.println("Stack is empty");
        
    }
    public void show()
    {
        Node n=top;
       while(n.next!=null)
       {
           System.out.print(n.data+" ");
           n=n.next;
       }
           System.out.print(n.data+" ");//for last node
       
    }
}
public class Stack_using_ll {
    public static void main(String args[])
    {
        Stacks obj =new Stacks();
        obj.pushs(34);
        obj.pushs(90);
        obj.pushs(89);
        obj.show();
        obj.pops();
        obj.show();
        obj.pops();
        obj.show();
        obj.peek();
        
    }
}
