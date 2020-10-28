public int check()
    {
               
         Nodeu temp1=head;
        Nodeu temp2=head;

        while(temp1!=temp2&&temp2.next!=null&&temp2.next.next!=null)
        {
            temp1=temp1.next;
            temp2=temp2.next.next;
                   
        }
            if(temp1==temp2)
            {
                System.out.println("circular ll");
            return 1;
            }
        
    return 0;    
    }
 
