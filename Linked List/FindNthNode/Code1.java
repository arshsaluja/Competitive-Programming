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
//Find nth node from the end of a Linked List
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
     int count=n;
     Nodes temp=head;
     
     while(temp!=null)
     {
         Nodes temp2=temp;
         while(temp2!=null)
         {
             if(count>0&&temp2.next!=null)
             {
                 count--;
                 temp2=temp2.next;
             }
             if(count>0&& temp2.next==null)
             {
                 System.out.println("Fewer no of nodes");
                 return 0;
             }
             if(count==0 && temp2.next!=null)
             {
                 temp=temp.next;
                 count=n;  
                 break;
             }
             if(count==0 && temp2.next==null)
             {
                 System.out.println("Node found");
                 
                 System.out.println(temp.data);
                 return temp.data;
             }
         }
         
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
