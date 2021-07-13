/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode h=head;ListNode m=null;ListNode mi=null;
         ListNode t=new ListNode(0);
        ListNode ti=new ListNode(0);
        int c=0;
        while(h!=null)
        {
            c++;
            h=h.next;
        }
        h=head;
        for(int i=0;i<c;i++)
        {
            if(i%2==0)
            {
                ListNode he=new ListNode(h.val);
                t.next=he;
                if(m==null)
                    m=t.next;
             
                 t=t.next;
            }
            else
            {
                ListNode he=new ListNode(h.val);
                ti.next=he;
                if(mi==null)
                    mi=ti.next;
             
                 ti=ti.next;
            }
            h=h.next;
           
        }
        t.next=mi;
        return m;
    }
}
