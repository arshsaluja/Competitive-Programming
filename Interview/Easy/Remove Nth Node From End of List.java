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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode t=head;
        int c=0;
        while(t.next!=null)
        {
            c++;
            t=t.next;
        }
        t=head;
        // System.out.println(head.val);
        // System.out.println(head.next.val);
        // System.out.println(c);
        if(c==0) return null;
        if(c+1==n){
            // System.out.println(" -"+head.next.val);
            return head.next;
        }
        System.out.println(c);
        t=head;
        for(int i=0;i<c-n;i++)
        {
            // System.out.println(head.val);
            head=head.next;
            
        }
        
        ListNode l=head.next.next;
        head.next=l;
      return t;  
    }
}
