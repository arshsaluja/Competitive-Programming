 class LinkedList
{
  Node head;
  public void InsertAtStart(int data)
  {
      Node node=new Node();
      node.data=data;
      node.next=null;
      node.next=head;
      head=node;
    }
public void show()
{
    Node n=head;//temp node to traverse
    while(n.next!=null)
    {
        System.out.println(n.data);
        n=n.next;
    }
        System.out.println(n.data);//for last element
    
}
}
class Node
{
    int data;
    Node next;
}
public class LinkedListTraversing {
    public static void main(String args[])
    {
        LinkedList list=new LinkedList();
        
        list.InsertAtStart(22);
        
        list.show();
        
        
    }
    }
