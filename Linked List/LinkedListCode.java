/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming;

/**
 *
 * @author DELL
 */
 class LinkedList
{
  Node head;
  public void deleteAt(int index)
  {
      //if the node we want to delete is at firt index then do head=head.next
      if(index==0)
      {
          head=head.next;//imp cond.
      }
      else
      {
          Node n =head;
          Node n1=null;
          for(int i=0;i<index-1;i++)
          {
           n=n.next;
          }
          n1=n.next;
          n.next=n1.next;
          System.out.println("Deleted element is: "+n1.data);
          n1=null;
          
      }
  }
  public void InsertAtmid(int index,int data)
  {
      Node node=new Node();
      node.data=data;
      node.next=null;
      Node n=head;
      if(index==0)
      {
          InsertAtStart( data);
      }
     for(int i=0;i<index-1;i++)
     {
         n=n.next;
     }
     node.next=n.next;
     n.next=node;
  }
  public void InsertAtStart(int data)
  {
      Node node=new Node();
      node.data=data;
      node.next=null;
      node.next=head;
      head=node;
    }
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
        
        list.InsertAtStart(22);
        
        list.InsertAtmid(1,67);
        
        list.deleteAt(2);
        
        list.show();
        
        
    }
    }

    

