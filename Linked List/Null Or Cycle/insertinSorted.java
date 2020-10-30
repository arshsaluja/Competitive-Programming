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
class N
        {
int data;
N next;
}
public class prob15 {
    static N head;
    static void insert(int data)
    {
        N n=new N();
        n.data=data;
        n.next=null;
        if(head==null)
            head=n;
        else
        {
            N t=head;
            while(t.next!=null)
            {
                t=t.next;
            }
            t.next=n;
        }
        
            
    }
    static void insertinSorted(int data)
    {
        N no=new  N();
        no.data=data;
        no.next=null;
        
        if(head==null)
            head=no;
        else
        {
        N temp=head,taur  = null;
        while(temp!=null&&no.data>temp.data)
        {
            taur=temp;
            temp=temp.next;
        }
        no.next=temp;
        
        taur.next=no;
       
        
            }
    }
    static void show()
{
    N n=head;//temp node to traverse
    while(n.next!=null)
    {
        System.out.println(n.data);
        n=n.next;
    }
        System.out.println(n.data);//for last element
    
}
    public static void main(String args[])
    {
        insert(1);
        insert(2);
        insert(3);
        insert(5);
        show();
        insertinSorted(4);
        show();
        
    }
}
