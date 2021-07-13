
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dum=new ListNode(0);
        ListNode t=dum;
        ListNode h1=l1;
        ListNode h2=l2;int carry=0;
        while(h1!=null||h2!=null)
        {
            int a=(h1!=null)?h1.val:0;
             int b=(h2!=null)?h2.val:0;
            int sum=a+b+carry;
            carry=sum/10;
            int d=sum%10;
            ListNode l=new ListNode(d);
            t.next=l;
            if(h1!=null)h1=h1.next;
            if(h2!=null)h2=h2.next;
            t=t.next;
        }
        if(carry>0)
        {
            ListNode l=new ListNode(carry);
            t.next=l;
            t=t.next;
        }
        return dum.next;
    }
}
