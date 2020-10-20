class LinkedList
{
  Node head;
public void insert(int data)
{
//Create new node
    Node node=new Node();
    node.data=data;
    node.next=null;//optional as its always null
    if(head==null)
        head=node;
    else
    {
        //temp node to traverse
        Node n=head;
        while(n.next!=null)
        {
            n=n.next;
        }
        n.next=node;
    }
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
        list.insert(18);
        list.insert(45);
        list.insert(34);
        list.show();
    }
    }
