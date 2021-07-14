/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode l1, ListNode l2) {
            ListNode h1=l1;int c1=0;
        ListNode h2=l2;int c2=0;
        while(h1!=null)
        {
            c1++;
            h1=h1.next;
        }
        while(h2!=null)
        {
            c2++;
            h2=h2.next;
        }
        int d=0;
        if(c1>c2)
        d=c1-c2;
        else
            d=c2-c1;
        
        ListNode l=(c1>c2)?l1:l2;
        ListNode s=(c1<c2)?l1:l2;
        if(c1==c2)
        {
            l=l1;
        s=l2;
        }
        while(d!=0)
        {
            l=l.next;
            d--;
        }
        ListNode t=null;
        while(l!=null||s!=null)
        {
             System.out.println(" val "+s.val+"  add "+s);
            System.out.println("  "+s.val+"  add "+s);
            if(l==s)
            {
                t=l;
                
            System.out.println("fl  "+l.val);
                System.out.print("fs  "+s.val);
                System.out.print("ft  "+t.val);
               return t;
            }
            s=s.next;
            l=l.next;
        }
        return t;
        
    }
}
