
import java.util.*;
public class Queue {
    static int top=-1;
    static int end=-1;
    static void enqueue(int n,int a[],int data)
    {
            if(top==(end+1)%n)
                System.out.println("queue is full");
            else
            {
                 if(top==-1)
        {
        top++;
        }
                end=(end+1)%n;
                a[end]=data;
            }
        
    }
    static int dequeue(int n,int a[])
    {
        int data=0;
        if(top==-1)
            System.out.println("queue is empty");
        else
        {
           data=a[top];
           if(top==end)
               top=end=-1;
           else
               top++;
    }
        return data;
    }
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     
    enqueue(n,a,10);
    enqueue(n,a,11);
    enqueue(n,a,12);
    enqueue(n,a,13);
    System.out.println("deleted emenet is"+dequeue(n,a));
    System.out.println("deleted emenet is"+dequeue(n,a));
    
    }
}
