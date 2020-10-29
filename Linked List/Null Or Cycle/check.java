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
class Noder 
{
    int data;
    Noder next;
}
public class prob11 {
public static void main(String args[])
{
    Noder node1 = new Noder();
        Noder node2 = new Noder();
        Noder node3 = new Noder();
        Noder node4 = new Noder();
        Noder node5 = new Noder();
        Noder node6 = new Noder();
        node1.data = 1;
        node2.data = 2;
        node3.data = 3;
        node4.data = 4;
        node5.data = 5;
        node6.data = 6;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node3;
        if(check(node1)==true)
        {
            System.out.println("snail");
            
        }
        else
        {
            
            System.out.println("SnaKe");
        }
		
}
    static boolean check(Noder head)
    {
         Noder temp1=head;
        Noder temp2=head;

        while(true)
                
        {
            if(temp2==null||temp2.next==null)
                return false;
            temp1=temp1.next;
            temp2=temp2.next.next;
               if(temp1==temp2)
            {
               
            return true;
            }
            
        }

    }
}
