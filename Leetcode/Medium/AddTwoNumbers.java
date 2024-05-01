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
        int d;
        int carry=0;
        ListNode res=new ListNode();
        ListNode r=res;
        while(l1 !=null ||l2!=null){
            int a=(l1!=null)? l1.val:0;
            int b=(l2!=null)? l2.val:0;
            int sum= a+b+carry;
            carry=sum/10;
            d=sum%10;
            ListNode dum=new ListNode(d);
            res.next=dum;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            res=res.next;
        }
        if(carry>0)
        {
            ListNode dum=new ListNode(carry);
            res.next=dum;
            res=res.next;
        }
return r.next;
    }
}
